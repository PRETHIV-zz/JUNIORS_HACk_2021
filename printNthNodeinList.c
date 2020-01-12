void PrintNth(struct Node* head,int n)
{
    n==1?printf("\n%d",head->data):PrintNth(head->link,n-1);
    }
