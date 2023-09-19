package io.spherelabs.data.local.db

import app.cash.sqldelight.db.SqlDriver
import io.spherelabs.local.db.LockerDatabase

expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driver: DriverFactory): LockerDatabase {
    return LockerDatabase.invoke(driver.createDriver())
}
