SUMMARY = "A scalable data-integrity protocol with feeless micro-payment support for the IoT and m2m economy (IOTA)."
DESCRIPTION = "Providing data integrity and support for machine-to-machine micropayments is IOTA's vision in order to become the backbone protocol for Internet-of-Things (IoT)."
HOMEPAGE = "https://www.iota.org/"
LICENSE = ""
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit cargo

SRC_URI = "git://github.com/iotaledger/bee.git;branch=dev"
SRCREV = "fa49982208182986af0c5100fdc7e77bea4a7f4a"

S = "${WORKDIR}/git"
