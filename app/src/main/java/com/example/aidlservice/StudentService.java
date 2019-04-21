package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.example.aidlservice.aidl.IStudent;
import com.example.aidlservice.aidl.student.StudtInfo;

public class StudentService extends Service {

    private static final String TAG = "StudentService";

    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }

    private IStudent.Stub stub = new IStudent.Stub() {
        @Override
        public void addStudentInfoReq(StudtInfo studtInfo) {
            Log.d(TAG, "姓名：" + studtInfo.getName()
                    + " 数学成绩：" + studtInfo.getMathScore()
                    + " 英语成绩：" + studtInfo.getEnglishScore());
        }
    };
}
