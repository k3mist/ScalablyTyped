package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  def failure(bucket: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, errorString: java.lang.String): js.Any
  def success(
    bucket: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket,
    query: kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery,
    count: scala.Double
  ): js.Any
}

object Anon_Bucket {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, java.lang.String) => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery, scala.Double) => js.Any
  ): Anon_Bucket = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_Bucket]
  }
}

