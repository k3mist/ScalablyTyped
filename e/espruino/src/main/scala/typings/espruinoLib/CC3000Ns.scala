package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("CC3000")
@js.native
object CC3000Ns extends js.Object {
  /**
    * <p>Initialise the CC3000 and return a WLAN object</p>
    * 
    * @param spi 
    * @param cs 
    * @param en 
    * @param irq 
    * @return  
    * @url http://www.espruino.com/Reference#l_CC3000_connect
    */
  def connect(spi: js.Any, cs: espruinoLib.Pin, en: espruinoLib.Pin, irq: espruinoLib.Pin): espruinoLib.WLAN = js.native
}

