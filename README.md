openmaxims-linux
================

a fork of openMAXIMS open EPR/ADT/order-comms project, adapted to compile in a linux environment
see the openMAXIMS GitHub repo here: https://github.com/IMS-MAXIMS/openMAXIMS

###So Far:
* setup vagrant base box ubuntu trusty server 32
* ensured enough cpu resources and RAM allocated to the VM (I initially had problems with insufficient resources and RAM allocated, see also Swapfile comment) 
* `vagrant up`
* `vagrant ssh`
* added swapfile (I enabled a decent sized Swapfile, this is not part of a normal Vagrant Base box but helps out with large transient RAM requirements)
* extracted openMAXIMS_01_MAY_2014_Source_Archive.zip into /vagrant
* /from now on all paths mentioned are relative to openMAXIMS_01_MAY_2014_Source:/
* followed build environment instructions in README.TXT
* decided probably easier to add SETENV.bat content to .bash_profile or similar linux env file rather than converting SETENV.bat into another Bash script
* edited /vagrant/openMAXIMS_01_MAY_2014_Source/build_openMAXIMS.bat:
	* edited contents to work with Linux (forward slashes and case-sensitivity)
		* `#! /bin/bash`
		* `cd ./openmaxims_workspace/WebApp`
		* `ant -f WebAppBuild.xml`
	* renamed to build_openMAXIMS.sh
* saved /home/marcus/VMs/imsmaxims-vagrant/openMAXIMS_01_MAY_2014_Source/openmaxims_workspace/Admin/src/ims/admin/helper/Keywords.java in UTF-8 encoding
* realised there might be a lot more UTF-8 re-encoding required as other compiler error messages came in, therefore I put the whole lot into version control
* `<deep_breath />`
* re-encoded as UTF-8 all .java files that the compiler couldn't compile due to charset encoding issues (these were mainly Logic.java files). I considered a job-lot re-encoding to UTF-8 but thought this might break stuff so I just re-encoded the stuff that was failing.
* CAREUK/src and Racpc/src missing - I have raised this as an issue on openMAXIMS' GitHub repo, and for now as a workaround I've commented out all references to CAREUK & Racpc in the WebAppBuild.xml build file. But this breaks later when these classes are called but haven;t been built.
* ` <brick_wall /> `
*
