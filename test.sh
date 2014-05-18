#!/bin/bash

DIR=$(cd $(dirname $0); pwd)

rm -rf /tmp/testdir
mkdir /tmp/testdir
cd /tmp/testdir

g8 file://$DIR/ --name=test --force

if test $? -ne 0 ; then
    echo "error, create templete"
    exit 1
fi

cd test

bash ./sh/setup.sh
if test $? -ne 0 ; then
    echo "error, setup.sh"
    exit 1
fi

./gradlew robospock:testDevDebug
if test $? -ne 0 ; then
    echo "error, sample test failed"
    exit 1
fi

./gradlew app:assembleDebug
if test $? -ne 0 ; then
    echo "error, create apk"
    exit 1
fi

./gradlew app:findbugs
if test $? -ne 0 ; then
    echo "error, create findbugs report"
    exit 1
fi

echo "end."

exit 0
