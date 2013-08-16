#!/bin/sh

cd `dirname $0`

echo "Removing all assets/img/*"
rm -Rf ../assets/img/*

echo "Triggering TexturePacker2 img-atlas/ ../assets/img/"
java -cp gdx-tools.jar:../libs/gdx.jar com.badlogic.gdx.tools.imagepacker.TexturePacker2 img-atlas/ ../assets/img/
