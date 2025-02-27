#!/bin/bash
set -e  # Exit immediately if a command exits with a non-zero status

directories=("ais-models" "ais-stream-processor" "geo-data-producer" "hurtigruten")

# Loop through each directory and run the Gradle build
for dir in "${directories[@]}"; do
  echo "Entering directory: $dir"
  pushd "$dir" > /dev/null

  echo "Running ./gradlew build in $dir"
  ./gradlew build

  popd > /dev/null
  echo "Finished building in $dir"
done

# Once all builds are complete, run docker-compose to start the containers with a rebuild
echo "Starting Docker containers with docker-compose up --build"
docker-compose up --build
