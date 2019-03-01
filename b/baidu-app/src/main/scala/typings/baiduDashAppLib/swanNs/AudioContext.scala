package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音频组件控制
/**
	 * audioContext 通过 audioId 跟一个 <audio/> 组件绑定，通过它可以操作对应的 <audio/> 组件。
	 */
trait AudioContext extends js.Object {
  /**
  		 * 暂停
  		 */
  def pause(): scala.Unit
  /**
  		 * 播放
  		 */
  def play(): scala.Unit
  /**
  		 * 跳转到指定位置，单位 s
  		 */
  def seek(position: scala.Double): scala.Unit
  /**
  		 * 音频的地址
  		 */
  def setSrc(src: java.lang.String): scala.Unit
}

object AudioContext {
  @scala.inline
  def apply(
    pause: js.Function0[scala.Unit],
    play: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit],
    setSrc: js.Function1[java.lang.String, scala.Unit]
  ): AudioContext = {
    val __obj = js.Dynamic.literal(pause = pause, play = play, seek = seek, setSrc = setSrc)
  
    __obj.asInstanceOf[AudioContext]
  }
}

