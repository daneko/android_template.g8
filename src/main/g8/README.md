## how to setup

```sh
sh ./sh/setup.sh
```

## how to do testing

```sh
./gradlew robospock:testDevDebug
```

## テスト系の追加をした時のメモ

* robospockのやつを直接使うと今の構成だとActivityに対するテストが出来ない
  * AndroidAnnotations で生成されたclassが読み取れていないっぽい
* gradle-android-test-plugin を robolectricのものを使うと 'android' pluginが無いと怒る上に、結局うまく行かない
* ので com.novoda のものを入れたけど、[issueの通り](https://github.com/novoda/gradle-android-test-plugin/pull/11)
  * 上記は何れ解決すると思う (2014/05/16)
  * ので暫定的にsetup.shみたいなものを置いておきました

※ あくまで今の構成だから動かない！ってことだと思う
