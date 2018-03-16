#include <stdio.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <unistd.h>
#include <string.h>

int main()
{	
	int clientSocket,newSocket;
	char buffer[1024];
	struct sockaddr_in serverAddr;
	struct sockaddr_storage serverStorage;
	socklen_t addr_size;

	clientSocket = socket(PF_INET , SOCK_STREAM, 0);
	serverAddr.sin_family = AF_INET;
	serverAddr.sin_port = htons(7891);
	serverAddr.sin_addr.s_addr = inet_addr("192.168.61.128");
	memset(serverAddr.sin_zero, '\0', sizeof serverAddr.sin_zero);
	bind(clientSocket,(struct sockaddr 
*) &serverAddr,sizeof(serverAddr));


if(listen(clientSocket,5)==0)
	printf("Listening\n");
else
	printf("Error\n");

addr_size = sizeof serverStorage;
newSocket = accept(clientSocket, (struct sockaddr *) &serverStorage, 
&addr_size);

puts("Connection Establish");
recv(newSocket,buffer,100,0);

char a[]= "Assalamualaikum";
char b[100];
strcpy(b,buffer);

if(strcmp (b, a)==0)
{
	strcpy(buffer,"Waalaikumussalam\n");

}
else
{
	strcpy(buffer, "Are you Muslim???\n");
} 

	send(newSocket,buffer,100,0);

return 0;

}
# server
