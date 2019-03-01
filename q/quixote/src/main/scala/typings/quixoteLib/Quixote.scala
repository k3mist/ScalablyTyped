package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quixote extends js.Object {
  // Create a test iframe. This is a slow operation, so once you have a frame, it's best to use QFrame.reset() on it rather than creating a new frame for each test
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* loadedFrame */ QFrame, scala.Unit]
  ): QFrame
}

object Quixote {
  @scala.inline
  def apply(
    createFrame: js.Function2[
      QuixoteFrameOptions, 
      js.Function2[/* err */ stdLib.Error, /* loadedFrame */ QFrame, scala.Unit], 
      QFrame
    ]
  ): Quixote = {
    val __obj = js.Dynamic.literal(createFrame = createFrame)
  
    __obj.asInstanceOf[Quixote]
  }
}

