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

void equeue(struct node** head,int info){
    struct node* newNode = createNode(info);
    if(*head == NULL){
        *head = newNode;
    }
    else{
        struct node* temp = *head;
        while(temp->link != NULL){
            temp = temp->link;
        }
        temp->link = newNode;
    }
}

void dequeue(struct node** head){
    if(*head == NULL){
        printf("Linked list not found");
    }
    else if((*head)->link == NULL){
        free(*head);
    }
    else{
        struct node* f = *head;
        *head = (*head)->link;
        printf("removed element %d\n",f->info);
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
    equeue(&head,10);
    equeue(&head,20);
    equeue(&head,30);
    equeue(&head,40);
    equeue(&head,50);

    display(&head);

    printf("\n");
    dequeue(&head);
    display(&head);
}