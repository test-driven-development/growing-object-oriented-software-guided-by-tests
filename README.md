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

#### once the server is running, configure the following accounts:

````
sniper : sniper
auction-item-54321 : auction
auction-item-65432 : auction
````


___

#### once the server is running, configure the following accounts:

````
sniper : sniper
auction-item-54321 : auction
auction-item-65432 : auction
````


___

> We set it up to not store offline messages, which meant there was no persistent state. In the System Manager, we edited the “System Name” property to be localhost, so the tests would run consistently. Finally, we set the resource policy to “Never kick,” which will not allow a new resource to log in if there’s a conflict.
