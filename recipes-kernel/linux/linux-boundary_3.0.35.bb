# Adapted from linux-imx.inc, copyright (C) 2013 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

DESCRIPTION = "Linux kernel for Boundary Devices boards"

SRC_URI = "git://github.com/boundarydevices/linux-imx6.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-4.1.0+yocto"
SRCBRANCH = "boundary-imx_3.0.35_4.1.0"
SRCREV = "79a3b6d5276a4025411367912c33d7d4f5e63c15"

COMPATIBLE_MACHINE = "(mx6)"
