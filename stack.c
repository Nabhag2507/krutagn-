#include<stdio.h>
#include<stdlib.h>

struct node{
    int info;
    struct node* link;
};

struct node* createNode(int info){
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->info = info;
    newNode->link = NULL;
    return newNode;
}

void push(struct node** head,int info){
    struct node* newNode = createNode(info);
    if(*head == NULL){
        *head = newNode;
    }
    else{
        newNode->info = info;
        newNode->link = *head;
        *head = newNode;
    }
}

void pop(struct node** head){
    if(*head == NULL){
        printf("Linked list not found");
    }
    else if((*head)->link == NULL){
        free(*head);
    }
    else{
        struct node* f = *head;
        *head = (*head)->link;
        free(f);
    }
}

void display(struct node** head){
    struct node* temp = *head;
    while(temp != NULL){
        printf("%d , ",temp->info);
        temp = temp->link;
    }
}

void main(){
    struct node* head = NULL;
    push(&head,10);
    push(&head,20);
    push(&head,30);
    push(&head,40);
    push(&head,50);

    display(&head);

    printf("\n");
    pop(&head);
    display(&head);
}