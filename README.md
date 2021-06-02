# goos

## growing object-oriented software guided by tests

### Getting Started

#### use the following docker image:

```bash
docker pull gizmotronic/openfire:4.4.4

```

___

#### run it as follows:

```bash
sudo docker run --name openfire -d --restart=always --publish 9090:9090 --publish 5222:5222 --publish 7777:7777 --volume ~/.openfire:/var/lib/openfire gizmotronic/openfire:4.4.4
```

___

#### logon to the administrator's portal in the browser:

```bash
localhost:9090
```

___

#### for `Language Selection`, make your choice and, continue 
___
![(01) Language Selection](images/openfire-admin-(02)-Server-Settings.png)

___

#### for Language Selection, make your choice and, continue
___
![(02) Server Settings](images/openfire-admin-(02)-Server-Settings.png)
___


> We set it up to not store offline messages, which meant there was no persistent state. In the System Manager, we edited the “System Name” property to be localhost, so the tests would run consistently. Finally, we set the resource policy to “Never kick,” which will not allow a new resource to log in if there’s a conflict.
