package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCanvasOptions extends js.Object {
  /**
  		 * 绘图动作数组，由 swan.createCanvasContext 创建的 context，
  		 * 调用 getActions 方法导出绘图动作数组。
  		 */
  var actions: js.Array[CanvasAction]
  /** 画布标识，传入 <canvas/> 的 cavas-id */
  var canvasId: scala.Double | java.lang.String
}

object DrawCanvasOptions {
  @scala.inline
  def apply(actions: js.Array[CanvasAction], canvasId: scala.Double | java.lang.String): DrawCanvasOptions = {
    val __obj = js.Dynamic.literal(actions = actions, canvasId = canvasId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrawCanvasOptions]
  }
}

