package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomainName extends js.Object {
  var domainName: java.lang.String
  var resourceRecordName: java.lang.String
  var resourceRecordType: java.lang.String
  var resourceRecordValue: java.lang.String
}

object Anon_DomainName {
  @scala.inline
  def apply(
    domainName: java.lang.String,
    resourceRecordName: java.lang.String,
    resourceRecordType: java.lang.String,
    resourceRecordValue: java.lang.String
  ): Anon_DomainName = {
    val __obj = js.Dynamic.literal(domainName = domainName, resourceRecordName = resourceRecordName, resourceRecordType = resourceRecordType, resourceRecordValue = resourceRecordValue)
  
    __obj.asInstanceOf[Anon_DomainName]
  }
}

