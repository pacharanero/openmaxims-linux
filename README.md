openmaxims-linux
================

a fork of openMAXIMS open EPR/ADT/order-comms project, adapted to compile in a linux environment

###So Far:
* setup vagrant base box ubuntu trusty server 32
* ensured enough cpu resources and RAM allocated to the VM (I had problems with insufficient resources and RAM allocated, see also Swapfil comment) 
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
* <deep breath />
