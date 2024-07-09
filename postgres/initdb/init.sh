#!/bin/bash
set -e
echo -e "\n=====>>> Criando database conta_clara <<<========\n"
psql -U postgres -c "CREATE DATABASE conta_clara;"

echo -e "\n=====>>> Import postgres-estado.sql <<<========\n"
psql -U postgres -d conta_clara < /docker-entrypoint-initdb.d/1_estado.sql

echo -e "\n=====>>> Import postgres-cidade.sql <<<========\n"
psql -U postgres -d conta_clara < /docker-entrypoint-initdb.d/2_cidade.sql
