package ru.samsung.itacademy.mdev.task4163

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters


class MyWork(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    val TAG = "MY_TAG"

    override fun doWork(): Result {
        Log.v(TAG, "Work is in progress")
        try {
            Thread.sleep(10000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        Log.v(TAG, "Work finished")
        return Result.success()
    }


}
