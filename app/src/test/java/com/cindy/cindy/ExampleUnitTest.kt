package com.cindy.cindy

import android.os.Parcel
import android.os.Parcelable
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest() : Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ExampleUnitTest> {
        override fun createFromParcel(parcel: Parcel): ExampleUnitTest {
            return ExampleUnitTest(parcel)
        }

        override fun newArray(size: Int): Array<ExampleUnitTest?> {
            return arrayOfNulls(size)
        }
    }

}