package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 音频播放对象
  * 音频播放对象，用于音频文件的播放。不能通过new方法直接创建，只能通过audio.createPlayer方法创建。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
  */
@js.native
trait PlusAudioAudioPlayer extends js.Object {
  /**
    * 获取音频流的总长度
    * 获取音频流的总长度，单位为秒，若长度未知则返回-1。如果还未获取到音频流信息则返回NaN，此时需要延迟获取此信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def getDuration(): scala.Double = js.native
  /**
    * 获取音频流当前播放的位置
    * 获取音频流当前播放的位置（已播放的长度），单位为s。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def getPosition(): scala.Double = js.native
  /**
    * 暂停播放音频
    * 需先调用createPlayer方法创建音频播放对象，并开始播放。音频播放对象在播放状态才能暂停，在其它状态调用此方法无任何作用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def pause(): scala.Unit = js.native
  /**
    * 开始播放音频
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def play(): scala.Unit = js.native
  def play(successCB: js.Function0[scala.Unit]): scala.Unit = js.native
  def play(successCB: js.Function0[scala.Unit], errorCB: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * 恢复播放音频
    * 音频播放对象在暂停状态才能恢复播放，在其它状态调用此方法无任何作用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def resume(): scala.Unit = js.native
  /**
    * 跳到指定位置播放音频
    * 跳到指定位置播放音频，音频播放对象在播放或暂停状态才能跳到指定播放音频，在其它状态调用此方法无任何作用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def seekTo(): scala.Unit = js.native
  def seekTo(position: scala.Double): scala.Unit = js.native
  /**
    * 设置音频输出线路
    * 可在音频文件开始播放前或播放的过程中改变音频输出线路，默认使用扬声器（plus.audio.ROUTE_SPEAKER）输出线路。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def setRoute(): scala.Unit = js.native
  def setRoute(route: scala.Double): scala.Unit = js.native
  /**
    * 停止播放音频
    * 停止播放音频，音频播放对象在播放或暂停状态才能停止播放，在其它状态调用此方法无任何作用。
    * 	停止播放后如果需要继续播放，则需调用play方法重新开始播放。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/audio.html](http://www.html5plus.org/doc/zh_cn/audio.html)
    */
  def stop(): scala.Unit = js.native
}

