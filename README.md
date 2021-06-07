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

#### in `Language Selection`, make your choice, and continue

___

![(01) Language Selection](images/openfire-admin-(01)-Language-Selection.png)

___

#### in `Server Settings`, use `localhost` as the `Fully Qualified Domain Name [FQDN]`, and continue

___

![(02) Server Settings](images/openfire-admin-(02)-Server-Settings.png)

___

#### in `Database Settings`, accept the default `Embedded Database`, and continue

___

![(03) Database Settings](images/openfire-admin-(03)-Database-Settings.png)

___

#### in `Profile Settings`, accept the default and continue

___

![(04) Profile Settings](images/openfire-admin-(04)-Profile-Settings.png)

___

#### in `Administrator Account`, accept the default and continue

___

![(05) Administrator Account](images/openfire-admin-(05)-Admin-Account.png)

___

#### in `Setup Complete!`, click `Login to the admin console`

___

![(06) Setup Complete!](images/openfire-admin-(06)-Login-to-the-admin-console.png)

___

#### login to the `Administration Console` with `username: admin`, `password: admin`

___

![(07) Setup Complete!](images/openfire-admin-(07)-login-with-username-–-password-admin-admin.png)

___
> We set it up to not store offline messages, which meant there was no persistent state. In the System Manager, we edited the “System Name” property to be localhost, so the tests would run consistently. Finally, we set the resource policy to “Never kick,” which will not allow a new resource to log in if there’s a conflict.
