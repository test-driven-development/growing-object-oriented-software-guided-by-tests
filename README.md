# goos

## growing object-oriented software guided by tests

### Getting Started

#### use the following docker image:

````
docker pull gizmotronic/openfire:4.2.3

````

___

#### run it as follows:

````
docker run --name openfire -d --restart=always --publish 9090:9090 --publish 5222:5222 --publish 7777:7777 --volume ~/git/wil/openfire:/var/lib/openfire gizmotronic/openfire:4.2.3
````


___
