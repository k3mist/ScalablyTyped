package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateScopeInfo extends js.Object {
  var CreateScopeInfo: js.Any
  var FrameworkIdentityInfo: js.Any
  var FrameworkIdentityType: Anon_EnumValuesAnonAggregateIdentity
  var GroupScopeType: Anon_EnumValuesAnonGeneric
  var IdentityBatchInfo: js.Any
  var IdentityScope: js.Any
  var IdentitySnapshot: js.Any
  var QueryMembership: Anon_EnumValuesAnonDirect
  var ReadIdentitiesOptions: Anon_EnumValuesAnonFilterIllegalMemberships
}

object Anon_CreateScopeInfo {
  @scala.inline
  def apply(
    CreateScopeInfo: js.Any,
    FrameworkIdentityInfo: js.Any,
    FrameworkIdentityType: Anon_EnumValuesAnonAggregateIdentity,
    GroupScopeType: Anon_EnumValuesAnonGeneric,
    IdentityBatchInfo: js.Any,
    IdentityScope: js.Any,
    IdentitySnapshot: js.Any,
    QueryMembership: Anon_EnumValuesAnonDirect,
    ReadIdentitiesOptions: Anon_EnumValuesAnonFilterIllegalMemberships
  ): Anon_CreateScopeInfo = {
    val __obj = js.Dynamic.literal(CreateScopeInfo = CreateScopeInfo, FrameworkIdentityInfo = FrameworkIdentityInfo, FrameworkIdentityType = FrameworkIdentityType, GroupScopeType = GroupScopeType, IdentityBatchInfo = IdentityBatchInfo, IdentityScope = IdentityScope, IdentitySnapshot = IdentitySnapshot, QueryMembership = QueryMembership, ReadIdentitiesOptions = ReadIdentitiesOptions)
  
    __obj.asInstanceOf[Anon_CreateScopeInfo]
  }
}

