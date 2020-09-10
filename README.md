# ReviewApp

レビューアプリ（仮）
作成途中…

## 更新履歴

* 2020/08/19 Entityクラス作成途中

## 機能

1. ログイン機能(時間があれば実装)
2. レビュー記事閲覧
3. レビュー記事作成
4. 検索機能
5. 新規ユーザ登録

## データベース概要

* ユーザ管理
* 映画情報
* レビュー

## 開発環境

* OS : Mac(Catalina 10.15.6)
* IDE : IntelliJ IDEA,Visual Studio Code
* Lang : Java11
* DB : MySQL
* Spring Boot Ver : 2.3.3.RELEASE

# データベース一覧

## Users(ユーザーテーブル)
| user_id | account_name | password | name | address | email |
| :-: | :-: | :-: | :-: | :-: | :-: |
| 1 | hoge | hogehoge | ホゲ田 | 東京 | hoge@sample.com |

<br>

## Review(レビューテーブル)
| user_id | review_id | review_title | movie_id | post_data | Impression | evaluation_id | show_id|  
| :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| 1 | 1 | やまだ | 1 | 2020/04/01 | 本文になる | 5 | 1 |

<br>

## Movie(映画情報テーブル)
| movie_id | movie_title | release_date | 
| :-: | :-: | :-: |
| 1 | hoge | 2000/01/01 |

<br>

## Evaluation(感想テーブル)
| evaluation_id | evaluation |
| :-: | :-: |
| 1 | 最低 |
| 2 | 微妙 |
| 3 | 普通 |
| 4 | 良い |
| 5 | 最高 |

<br>

## Show(鑑賞方法テーブル)
| show_id | method |
| :-: | :-: |
| 1 | 映画館 |
| 2 | Amazonプライム |
| 3 | Netflix |
| 4 | Hulu |
