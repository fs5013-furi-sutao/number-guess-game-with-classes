# 数当てゲームのサンプルコード（クラスを使用したバージョン）

クラスを使用したバージョンです。

数当てゲームの課題内容については、以下のページで確認してください。

39. 作成課題 ⭐ 数当てゲーム | Java Bootcamp:  
https://fs5013-furi-sutao.github.io/java-bootcamp/entry/39-number-guess-game

<br />

### パッケージ構成

#### メインパッケージ直下

> 1. App.java
> 2. Playground.java

#### domain パッケージ

プログラムの主となる興味対象をクラスとして集めたパッケージ

> 3. NumberSequence.java
> 4. ChallengeCounter.java
> 5. Judger.java

#### utils パッケージ

共通処理に関わるクラスを集めたパッケージ

> 6. UserInputReciever.java

#### config パッケージ

設定に関わるクラスを集めたパッケージ

> 7. Config.java
> 8. DistanceTypes.java

<br />

### 作成したクラスの説明

#### 1. App.java

> 数当てゲームの起点となるクラスです

#### 2. Playground.java

> 数当てゲームを繰り広げる場所をあらわすクラス

#### 3. NumberSequence.java

> 数字の並びをあらわすクラス

#### 4. ChallengeCounter.java

> トライ回数をあらわす

#### 5. Judger.java

> 正解とユーザの入力した数字を比較・判定するクラス

#### 6. UserInputReciever.java

> ユーザの入力受付けをあらわすクラス

#### 7. Config.java

> 設定値を決めるクラス

#### 8. DistanceTypes.java

> 値同士の距離を定義する列挙子

<br />
