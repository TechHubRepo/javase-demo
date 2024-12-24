#!/bin/bash
echo "[ Shell Script ] : Started";

echo "[ Shell Script ] : Creating Docker Image";
docker image build -t ramniwash/jlink:1.0.0 .

echo "[ Shell Script ] : Creating Docker Container";
docker run --name=jlinkCont ramniwash/jlink:1.0.0

echo "[ Shell Script ] : Deleting Docker Container";
docker container rm  -f jlinkCont

echo "[ Shell Script ] : Deleting Docker Image";
docker image rm  -f ramniwash/jlink:1.0.0

echo "[ Shell Script ] : Ended";

