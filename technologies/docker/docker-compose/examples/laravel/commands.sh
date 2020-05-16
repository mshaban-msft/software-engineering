###################################
# environment
###################################
# build
docker-compose build

# run environment
docker-compose up -d

# stop services
docker-compose down


###################################
# development
###################################
docker-compose run --rm composer dump-autoload
docker-compose run --rm composer install
docker-compose run --rm composer require something

docker-compose run --rm artisan config:cache
docker-compose run --rm artisan migrate