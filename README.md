Práctica 4: CtOS
====================
Materia: Modelado y Programación.

## Descripción.
La práctica consiste en diseñar un programa que simule un manager impresion de documentos mediante una impresora unica.
* `Proxy:` Para definir una relación cliente-servidor para el paso de datos. [(more info)](https://refactoring.guru/es/design-patterns/proxy).
* `Singleton:` Para definir una instancia unica de una clase. [(more info)](https://refactoring.guru/es/design-patterns/singleton).


## Equipo: Christian.
Colaboradores:
* `Leon Navarrete Adam Edmundo.`
* `Rubio Resendiz Marco Antonio.`
* `Valencia Pérez Guillermo Emanuel.`

## Para los colaboradores:
Primero que nada clonen el repositorio:
```
$ git clone https://github.com/Tocny/practica4
$ cd practica2/
```

Ya se los he dicho pero lo repito, AHUEVO TIENEN QUE TRABAJAR EN UNA RAMA. Si no lo hacen hay tabla >:l
De preferencia que la rama se llame como ustedes.
```
$ git branch nombre
$ git checkout nombre
```
Repito, esto es AHUEVO.

### En caso de errores de autenticación.
Cuando clonen o pusheen en el repositorio (en su rama) es posible que se topen con una cosa como esta cuando les pida la contraseña:
```
$ tocny@debian-Marco:~/Documentos/Code/Modelado/p1/practica1$ git push origin marco
$ Username for 'https://github.com': Tocny
$ Password for 'https://Tocny@github.com': 
$ remote: Support for password authentication was removed on August 13, 2021.
$ remote: Please see https://docs.github.com/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.
$ fatal: Autenticación falló para 'https://github.com/Tocny/practica1/'
```
Esto es, como se puede leer, porque ahora github no usa la contraseña de su cuenta para autentificarlos. Ahora se utiliza un token.

Si presentan este problema wachense [este video](https://www.youtube.com/watch?v=2nzOI-ynXF4&t=308s), donde pueden ver como generarlo y como usarlo, conserven bien ese token para que no anden batallando.

