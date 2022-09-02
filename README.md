## FusionAuth HTTP client and server

**NOTE:** This project is in progress.

The goal of this project is to build a full-featured HTTP server and client in plain Java without the use of any libraries. The general
requirements and roadmap are as follows:

* [ ] Basic HTTP 1.1 client
* [ ] Basic HTTP 1.1 server
* [ ] Support Keep-Alive
* [ ] Support Expect-Continue 100
* [ ] Support chunked request and response
* [ ] Support streaming entity bodies
* [ ] Support HTTP 2 in client
* [ ] Support HTTP 2 in server

## Examples Usages:

Coming soon (this is going to change a ton in the next few weeks, so we aren't providing examples yet).

### Helping out

We are looking for Java developers that are interested in helping us build the client and server. If you know a ton about networks and
protocols and love writing clean, high-performance Java, contact us at dev@fusionauth.io.

### Building with Savant

**Note:** This project uses the Savant build tool. To compile using Savant, follow these instructions:

```bash
$ mkdir ~/savant
$ cd ~/savant
$ wget http://savant.inversoft.org/org/savantbuild/savant-core/1.0.0/savant-1.0.0.tar.gz
$ tar xvfz savant-1.0.0.tar.gz
$ ln -s ./savant-1.0.0 current
$ export PATH=$PATH:~/savant/current/bin/
```