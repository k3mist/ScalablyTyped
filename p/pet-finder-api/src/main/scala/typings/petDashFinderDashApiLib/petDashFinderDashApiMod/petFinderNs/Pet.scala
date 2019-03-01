package typings
package petDashFinderDashApiLib.petDashFinderDashApiMod.petFinderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pet extends js.Object {
  var age: java.lang.String
  var animal: java.lang.String
  var breeds: js.Array[java.lang.String]
  var contact: Contact
  var description: java.lang.String
  var id: scala.Double
  var media: js.Any
  var mix: java.lang.String
  var name: java.lang.String
  var options: js.Array[java.lang.String]
  var sex: java.lang.String
  var shelterId: java.lang.String
  var shelterPetId: java.lang.String
  var size: java.lang.String
  var status: java.lang.String
}

object Pet {
  @scala.inline
  def apply(
    age: java.lang.String,
    animal: java.lang.String,
    breeds: js.Array[java.lang.String],
    contact: Contact,
    description: java.lang.String,
    id: scala.Double,
    media: js.Any,
    mix: java.lang.String,
    name: java.lang.String,
    options: js.Array[java.lang.String],
    sex: java.lang.String,
    shelterId: java.lang.String,
    shelterPetId: java.lang.String,
    size: java.lang.String,
    status: java.lang.String
  ): Pet = {
    val __obj = js.Dynamic.literal(age = age, animal = animal, breeds = breeds, contact = contact, description = description, id = id, media = media, mix = mix, name = name, options = options, sex = sex, shelterId = shelterId, shelterPetId = shelterPetId, size = size, status = status)
  
    __obj.asInstanceOf[Pet]
  }
}

