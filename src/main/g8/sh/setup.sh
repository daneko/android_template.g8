# https://github.com/novoda/gradle-android-test-plugin/pull/11
wget https://raw.githubusercontent.com/nenick/android-gradle-template/master/Scripts/install-custom-gradle-test-plugin.sh
sh ./install-custom-gradle-test-plugin.sh
rm -rf temp
rm ./install-custom-gradle-test-plugin.sh

chmod 755 ./gradlew
