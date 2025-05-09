package com.example.demo.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

/*
 * ユーザー用エンティティ
 * 作成者　奥野
 * 
 * バリデーション設定　北川
 */
 
@Data
public class User {
	
	private int user_id; //自動採番
	
	@NotBlank(message = "パスワードは必須です")
    @Size(min = 6, message = "パスワードは6文字以上で入力してください")
	private String user_pass;
	
	@NotBlank(message = "ユーザーネームは必須です")
    @Size(max = 20, message = "名前は20文字以内で入力してください")
	private String user_name;
	
	@Min(value = 20, message = "18歳以上である必要があります")
    @Max(value = 95, message = "年齢が高すぎます")
	private int user_age;
	
	//性別はBooleanやしバリデーションは省略
	private boolean user_gender;
	
	@NotBlank(message = "好きな部位は必須です")
    @Size(max = 15, message = "好きな部位は15文字以内で入力してください")
	private String user_likes;
	
	@Size(max = 15, message = "詳細は15文字以内で入力してください")
	private String user_detail;
	
	//画像データはバリデーションいらん
	private byte[] user_icon;
	
	@NotBlank(message = "メールアドレスは必須です")
    @Email(message = "メールアドレスの形式が正しくありません")
	private String user_address;
}