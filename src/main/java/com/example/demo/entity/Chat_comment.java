package com.example.demo.entity;

import lombok.Data;

@Data
public class Chat_comment{
    private int room_id;
    private int user_id;
    private String user_name;
    private String chat_comment;
    private String created_at;
}