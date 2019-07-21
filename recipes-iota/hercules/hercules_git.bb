SUMMARY = "Hercules is a lightweight alternative to IOTA's IRI."
DESCRIPTION = "Hercules compiles to native code and does not need Java Virtual Machine, which considerably decreases the amount of resources needed while increasing the performance. \
Hercules can run on embedded systems. \
Another feature that goes beyond IRI is local snapshots that can be done automatically or through the API for custom snapshotting strategies. \
"
LICENSE = "AGPL-3.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/AGPL-3.0;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "\
           git://gitlab.com/semkodev/hercules.git;protocol=https;name=hercules;destsuffix=${PN}-${PV}/src/gitlab.com/semkodev/hercules \
           git://github.com/dgraph-io/badger.git;protocol=https;name=badger;destsuffix=${PN}-${PV}/src/github.com/dgraph-io/badger \
           git://github.com/gin-gonic/gin.git;protocol=https;name=gin;destsuffix=${PN}-${PV}/src/github.com/gin-gonic/gin \
           git://github.com/op/go-logging.git;protocol=https;name=go-logging;destsuffix=${PN}-${PV}/src/github.com/op/go-logging \
           git://github.com/pkg/errors.git;protocol=https;name=errors;destsuffix=${PN}-${PV}/src/github.com/pkg/errors \
           git://github.com/spf13/pflag.git;protocol=https;name=pflag;destsuffix=${PN}-${PV}/src/github.com/spf13/pflag \
           git://github.com/spf13/viper.git;protocol=https;name=viper;destsuffix=${PN}-${PV}/src/github.com/spf13/viper \
           git://github.com/tonnerre/golang-go.crypto.git;protocol=https;name=golang-go.crypto;destsuffix=${PN}-${PV}/src/github.com/tonnerre/golang-go.crypto/sha3 \
           git://github.com/minio/highwayhash.git;protocol=https;name=highwayhash;destsuffix=${PN}-${PV}/src/github.com/minio/highwayhash \
           git://github.com/muxxer/diverdriver.git;protocol=https;name=driverdriver;destsuffix=${PN}-${PV}/src/github.com/muxxer/diverdriver \ 
           git://github.com/coocood/freecache.git;protocol=https;name=freecache;destsuffix=${PN}-${PV}/src/github.com/muxxer/freecache \
           git://github.com/pkg/profile.git;protocol=https;name=profile;destsuffix=${PN}-${PV}/src/github.com/pkg/profile \
           git://github.com/natefinch/lumberjack.git;protocol=https;name=lumberjack;destsuffix=${PN}-${PV}/src/gopkg.in/natefinch/lumberjack.v2;nobranch=1 \
           git://github.com/tildeleb/hashland.git;protocol=https;name=hashland;destsuffix=${PN}-${PV}/src/github.com/tildeleb/hashland \
           git://github.com/iotaledger/giota.git;protocol=https;name=giota;destsuffix=${PN}-${PV}/src/github.com/iotaledger/giota \
           git://github.com/lunixbochs/struc.git;protocol=https;name=struc;destsuffix=${PN}-${PV}/src/github.com/lunixbochs/struc \
           git://github.com/sigurn/crc8.git;protocol=https;name=crc8;destsuffix=${PN}-${PV}/src/github.com/sigurn/crc8 \
           git://gitlab.com/brunoamancio/remotePoW.git;protocol=https;name=remotePoW;destsuffix=${PN}-${PV}/src/gitlab.com/brunoamancio/remotePoW \
           git://github.com/cespare/xxhash.git;protocol=https;name=xxhash;destsuffix=${PN}-${PV}/src/github.com/cespare/xxhash \
           git://github.com/AndreasBriese/bbloom.git;protocol=https;name=bbloom;destsuffix=${PN}-${PV}/src/github.com/AndreasBriese/bbloom \
           git://github.com/dgryski/go-farm.git;protocol=https;name=go-farm;destsuffix=${PN}-${PV}/src/github.com/dgryski/go-farm \
           git://github.com/fsnotify/fsnotify.git;protocol=https;name=fsnotify;destsuffix=${PN}-${PV}/src/github.com/fsnotify/fsnotify \
           git://github.com/gin-contrib/sse.git;protocol=https;name=sse;destsuffix=${PN}-${PV}/src/github.com/gin-contrib/sse \
           git://github.com/golang/protobuf.git;protocol=https;name=protobuf;destsuffix=${PN}-${PV}/src/github.com/golang/protobuf \
           git://github.com/hashicorp/hcl.git;protocol=https;name=hcl;destsuffix=${PN}-${PV}/src/github.com/hashicorp/hcl \
           git://github.com/magiconair/properties.git;protocol=https;name=properties;destsuffix=${PN}-${PV}/src/github.com/magiconair/properties \
           git://github.com/mattn/go-isatty.git;protocol=https;name=go-isatty;destsuffix=${PN}-${PV}/src/github.com/mattn/go-isatty \
           git://github.com/mitchellh/mapstructure.git;protocol=https;name=mapstructure;destsuffix=${PN}-${PV}/src/github.com/mitchellh/mapstructure \
           git://github.com/pelletier/go-toml.git;protocol=https;name=go-toml;destsuffix=${PN}-${PV}/src/github.com/pelletier/go-toml \
           git://github.com/sigurn/utils.git;protocol=https;name=utils;destsuffix=${PN}-${PV}/src/github.com/sigurn/utils \
           git://github.com/spf13/afero.git;protocol=https;name=afero;destsuffix=${PN}-${PV}/src/github.com/spf13/afero \
           git://github.com/spf13/cast.git;protocol=https;name=cast;destsuffix=${PN}-${PV}/src/github.com/spf13/cast \
           git://github.com/spf13/jwalterweatherman.git;protocol=https;name=jwalterweatherman;destsuffix=${PN}-${PV}/src/github.com/spf13/jwalterweatherman \
           git://github.com/ugorji/go.git;protocol=https;name=codec;destsuffix=${PN}-${PV}/src/github.com/ugorji/go \
           git://github.com/golang/net.git;protocol=https;name=net;destsuffix=${PN}-${PV}/src/golang.org/x/net \
           git://github.com/golang/sys.git;protocol=https;name=sys;destsuffix=${PN}-${PV}/src/golang.org/x/sys \
           git://github.com/go-playground/validator.git;protocol=https;name=validator;destsuffix=${PN}-${PV}/src/gopkg.in/go-playground/validator.v8;nobranch=1 \
           git://github.com/go-yaml/yaml.git;protocol=https;name=yaml;destsuffix=${PN}-${PV}/src/gopkg.in/yaml.v2;nobranch=1 \
           git://github.com/golang/text.git;protocol=https;name=text;destsuffix=${PN}-${PV}/src/golang.org/x/text \
"

SRCREV_hercules = "dcefb8249aec132ec3c985989cb6f707c91054fa"
SRCREV_badger = "cdf9ffb40fde980875360cf2b1f7d66946fdc769"
SRCREV_gin = "2282be059be78f9f7f70a72ca4dd3bcfe5f972ee"
SRCREV_go-logging = "970db520ece77730c7e4724c61121037378659d9"
SRCREV_errors = "816c9085562cd7ee03e7f8188a1cfd942858cded"
SRCREV_pflag = "583c0c0531f06d5278b7d917446061adc344b5cd"
SRCREV_viper = "15738813a09db5c8e5b60a19d67d3f9bd38da3a4"
SRCREV_golang-go.crypto = "9bbb332f040b171b2fb4e08c53a3db3b3f6633c0"
SRCREV_highwayhash = "v1.0.0"
SRCREV_driverdriver = "91f4ae2b6dffd009e60e1ec040e38d8bb8f6d9b2"
SRCREV_freecache = "v1.1.0"
SRCREV_profile = "v1.3.0"
SRCREV_lumberjack = "v2.1"
SRCREV_hashland = "07375b562deaa8d6891f9618a04e94a0b98e2ee7"
SRCREV_giota = "c48646df86812898d8574e09d407f098613e61a7"
SRCREV_struc = "a9e4041416c2cd121670f6c3be4b0d523ee49b8a"
SRCREV_crc8 = "e55481d6f45c5a8f040343bace9013571dae103e"
SRCREV_remotePoW = "04c1368b219033db573433656faa84b9655acbc1"
SRCREV_xxhash = "v2.0.0"
SRCREV_bbloom = "28f7e881ca57bc00e028f9ede9f0d9104cfeef5e"
SRCREV_go-farm = "2de33835d10275975374b37b2dcfd22c9020a1f5"
SRCREV_fsnotify = "c2828203cd70a50dcccfb2761f8b1f8ceef9a8e9"
SRCREV_sse = "22d885f9ecc78bf4ee5d72b937e4bbcdc58e8cae"
SRCREV_protobuf = "e09c5db296004fbe3f74490e84dcd62c3c5ddb1b"
SRCREV_hcl = "ef8a98b0bbce4a65b5aa4c368430a80ddc533168"
SRCREV_properties = "c2353362d570a7bfa228149c62842019201cfb71"
SRCREV_go-isatty = "6ca4dbf54d38eea1a992b3c722a76a5d1c4cb25c"
SRCREV_mapstructure = "bb74f1db0675b241733089d5a1faa5dd8b0ef57b"
SRCREV_go-toml = "66540cf1fcd2c3aee6f6787dfa32a6ae9a870f12"
SRCREV_utils = "f19e41f79f8f006116f682c1af454591bc278ad4"
SRCREV_afero = "63644898a8da0bc22138abf860edaf5277b6102e"
SRCREV_cast = "8965335b8c7107321228e3e3702cab9832751bac"
SRCREV_jwalterweatherman = "7c0cea34c8ece3fbeb2b27ab9b59511d360fb394"
SRCREV_codec = "f3cacc17c85ecb7f1b6a9e373ee85d1480919868"
SRCREV_net = "5f9ae10d9af5b1c89ae6904293b14b064d4ada23"
SRCREV_sys = "79b0c6888797020a994db17c8510466c72fe75d9"
SRCREV_validator = "5f1438d3fca68893a817e4a66806cea46a9e4ebf"
SRCREV_yaml = "5420a8b6744d3b0345ab293f6fcba19c978f1183"
SRCREV_text = "5c1cf69b5978e5a34c5f9ba09a83e56acc4b7877"

inherit go

GO_IMPORT = "gitlab.com/semkodev/hercules"

do_compile_prepend(){
    rm -rf src/gitlab.com/semkodev/hercules/vendor
}

#DEPENDS = "bash"
#RDEPENDS_${PN}-dev = "bash"

#do_install_append(){
#    cp -r src/* ${D}${libdir}/go/src/
#}
