package typings
package uploadcareLib.uploadcareMod.UploadcareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var file: uploadcareLib.Anon_Callback
  var files: uploadcareLib.Anon_CallbackErr
}

object Instance {
  @scala.inline
  def apply(file: uploadcareLib.Anon_Callback, files: uploadcareLib.Anon_CallbackErr): Instance = {
    val __obj = js.Dynamic.literal(file = file, files = files)
  
    __obj.asInstanceOf[Instance]
  }
}

