package com.example.protobufdemo;

import android.os.Bundle;
import android.widget.TextView;

import com.google.protobuf.InvalidProtocolBufferException;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       TextView tv = findViewById(R.id.textView);
        Helloword.HelloRequest helloRequest =
                Helloword.HelloRequest.newBuilder().setName("哈哈哈")
                        .setAge(18)
                        .build();
        Helloword.HelloRequest.Hahhah dddd = Helloword.HelloRequest.Hahhah.newBuilder().setTask("dddd").build();

        //获得序列化后数据大小
        helloRequest.getSerializedSize();

        //序列化
        byte[] bytes = helloRequest.toByteArray();
        //反序列化
        try {
            Helloword.HelloRequest helloRequest1 = Helloword.HelloRequest.parseFrom(bytes);

               tv.setText(helloRequest1.getName());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        byte[] bytes1 = dddd.toByteArray();
        try {
            Helloword.HelloRequest.Hahhah.parseFrom(bytes1);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}