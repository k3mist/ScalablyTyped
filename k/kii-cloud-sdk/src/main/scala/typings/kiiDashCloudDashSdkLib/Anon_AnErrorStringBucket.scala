package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringBucket[T] extends js.Object {
  def failure(bucket: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, anErrorString: java.lang.String): js.Any
  def success(
    queryPerformed: kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery,
    resultSet: js.Array[T],
    nextQuery: kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery
  ): js.Any
}

object Anon_AnErrorStringBucket {
  @scala.inline
  def apply[T](
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, java.lang.String) => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery, js.Array[T], kiiDashCloudDashSdkLib.KiiCloudNs.KiiQuery) => js.Any
  ): Anon_AnErrorStringBucket[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringBucket[T]]
  }
}

