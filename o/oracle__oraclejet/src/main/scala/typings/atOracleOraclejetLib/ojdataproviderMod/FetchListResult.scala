package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchListResult[K, D] extends js.Object {
  var data: js.Array[D]
  var fetchParameters: FetchListParameters[D]
  var metadata: js.Array[ItemMetadata[K]]
}

object FetchListResult {
  @scala.inline
  def apply[K, D](data: js.Array[D], fetchParameters: FetchListParameters[D], metadata: js.Array[ItemMetadata[K]]): FetchListResult[K, D] = {
    val __obj = js.Dynamic.literal(data = data, fetchParameters = fetchParameters, metadata = metadata)
  
    __obj.asInstanceOf[FetchListResult[K, D]]
  }
}

