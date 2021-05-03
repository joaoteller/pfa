Desafio 1

Crie um programa utilizando sua linguagem de programação favorita que faça uma listagem simples do nome de alguns módulos do curso Full Cycle os trazendo de um banco de dados MySQL. Gere a imagem desse container e a publique no DockerHub.

Gere uma imagem do nginx que seja capaz que receber as solicitações http e encaminhá-las para o container.

Crie um repositório no github com todo o fonte do programa e das imagens geradas.

Crie um arquivo README.md especificando quais comandos precisamos executar para que a aplicação funcione recebendo as solicitações na porta 8080 de nosso computador. Lembrando que NÃO utilizaremos Docker-compose nesse desafio.

docker network create pfa-network

docker run --init -d --network pfa-network --name pfa-mysql joaoteller/pfa-mysql

docker run -d --network pfa-network --name pfa-app joaoteller/pfa-app

docker run -d --network pfa-network --name pfa-nginx -p 80:80 joaoteller/pfa-nginx

Acessar http://localhost/modules