#include <stdio.h>
#include <string.h>

int main()
{
    char str[1000001];
    scanf("%s",str);
    
    int l = strlen(str);
    for(int flag =0;flag<(1<<l);flag++){
        for(int i=0;i<l;i++){
            if((flag&(1<<i))>0)
            printf("%c",str[i]);
        }
        printf("\n");
    }
   
    return 0;

}
