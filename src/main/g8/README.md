## 素のAndroidとかよくわからないのでどうにかしたい

を試している場所

素のAndroidを書かなければならない悲しみに備える場所とも言う

## テスト系の追加をした時のメモ

* robospockのやつを直接使うとちゃんと動いてくれない…
* gradle-android-test-plugin を robolectricのものを使うと 'android' pluginが無いと怒る上に、結局うまく行かない
* ので com.novoda のものを入れたけど、[コメントに貼ったissueの通り](https://github.com/novoda/gradle-android-test-plugin/pull/11)
  * 上記は何れ解決すると思う (2014/05/16)

※ あくまで今の構成だから動かない！ってことだと思う

## how to setup

sh ./sh/setup.sh

## how to do testing

./gradlew robospock:testDevDebug

