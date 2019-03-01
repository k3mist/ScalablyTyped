package typings
package reactDashLottieLib.reactDashLottieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener extends js.Object {
  /**
    * The event sent by Lottie
    */
  var eventName: reactDashLottieLib.reactDashLottieLibStrings.complete | reactDashLottieLib.reactDashLottieLibStrings.loopComplete | reactDashLottieLib.reactDashLottieLibStrings.enterFrame | reactDashLottieLib.reactDashLottieLibStrings.segmentStart | reactDashLottieLib.reactDashLottieLibStrings.config_ready | reactDashLottieLib.reactDashLottieLibStrings.data_ready | reactDashLottieLib.reactDashLottieLibStrings.loaded_images | reactDashLottieLib.reactDashLottieLibStrings.DOMLoaded | reactDashLottieLib.reactDashLottieLibStrings.destroy
  /**
    * A callback that will be executed when the given eventName is received
    */
  def callback(): scala.Unit
}

object EventListener {
  @scala.inline
  def apply(
    callback: js.Function0[scala.Unit],
    eventName: reactDashLottieLib.reactDashLottieLibStrings.complete | reactDashLottieLib.reactDashLottieLibStrings.loopComplete | reactDashLottieLib.reactDashLottieLibStrings.enterFrame | reactDashLottieLib.reactDashLottieLibStrings.segmentStart | reactDashLottieLib.reactDashLottieLibStrings.config_ready | reactDashLottieLib.reactDashLottieLibStrings.data_ready | reactDashLottieLib.reactDashLottieLibStrings.loaded_images | reactDashLottieLib.reactDashLottieLibStrings.DOMLoaded | reactDashLottieLib.reactDashLottieLibStrings.destroy
  ): EventListener = {
    val __obj = js.Dynamic.literal(callback = callback, eventName = eventName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventListener]
  }
}

