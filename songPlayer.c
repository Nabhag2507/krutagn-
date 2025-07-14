#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct node{
    char songName[50];
    struct node* lptr;
    struct node* rptr;
};

struct node* createNode(char songName[50]){
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    strcpy(newNode->songName,songName);
    newNode->lptr = NULL;
    newNode->rptr = NULL;
    return newNode;
}

void insertAtLast(struct node** head,char songName[50]){
    struct node* newNode = createNode(songName);
    if(*head == NULL){
        *head = newNode;
        (*head)->lptr = NULL;
        (*head)->rptr = NULL;
    }
    else{
        struct node* temp = *head;
        while (temp->rptr != NULL){
            temp = temp->rptr;
        }
        temp->rptr = newNode;
        newNode->lptr = temp;
    }
}

void display(struct node** head){
    struct node* temp = *head;
    while(temp != NULL){
        printf("%s\n",temp->songName);
        temp = temp->rptr;
    }
}

void main(){
    struct node* head = NULL;

    insertAtLast(&head,"song1");
    insertAtLast(&head,"song2");
    insertAtLast(&head,"song3");
    insertAtLast(&head,"song4");
    insertAtLast(&head,"song5");

    display(&head);
}