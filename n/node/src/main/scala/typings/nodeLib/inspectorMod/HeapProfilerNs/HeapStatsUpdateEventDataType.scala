package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapStatsUpdateEventDataType extends js.Object {
  /**
    * An array of triplets. Each triplet describes a fragment. The first integer is the fragment
    * index, the second integer is a total count of objects for the fragment, the third integer is
    * a total size of the objects for the fragment.
    */
  var statsUpdate: js.Array[scala.Double]
}

object HeapStatsUpdateEventDataType {
  @scala.inline
  def apply(statsUpdate: js.Array[scala.Double]): HeapStatsUpdateEventDataType = {
    val __obj = js.Dynamic.literal(statsUpdate = statsUpdate)
  
    __obj.asInstanceOf[HeapStatsUpdateEventDataType]
  }
}

