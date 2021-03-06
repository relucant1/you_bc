'use strict';
import React from 'react';
import PropTypes from 'prop-types';
//components
import RoommatesForm from "../../../components/profile/forms/RoommatesForm";
import ClassmatesForm from "../../../components/profile/forms/ClassmatesForm";
import FriendsForm from "../../../components/profile/forms/FriendsForm";
import PersonalForm from "../forms/PersonalForm";
//redux
import { connect }  from 'react-redux'
import { bindActionCreators } from 'redux';
import {
    hideClassmatesForm, hideFriendsForm, hidePersonalForm, hideRoommatesForm
} from "../../../actions/profile/profileUIActions";
import {
    updateClassmatesValuesRequest, updateFriendsValuesRequest, updatePersonalValuesRequest,
    updateRoommatesValuesRequest, updateWeChatIdRequest
} from "../../../actions/profile/profileUpdateActions";

const FormGroup = (props) => (
    <div>
        <ClassmatesForm showForm={props.showClassmatesForm}
                        classmates={props.classmates}
                        onDone={props.onClassmatesUpdate}
                        onClose={props.closeClassmatesEdit}
                        showWeChatInput={!props.personal.weChatId}
                        weChatId={props.personal.weChatId}
                        onWeChatIdDone={props.onWeChatIdDone}
        />
        <FriendsForm showForm={props.showFriendsForm}
                     friends={props.friends}
                     onDone={props.onFriendsUpdate}
                     onClose={props.closeFriendsEdit}
                     showWeChatInput={!props.personal.weChatId}
                     weChatId={props.personal.weChatId}
                     onWeChatIdDone={props.onWeChatIdDone}
        />
        <RoommatesForm showForm={props.showRoommatesForm}
                       roommates={props.roommates}
                       onDone={props.onRoommatesUpdate}
                       onClose={props.closeRoommatesEdit}
                       showWeChatInput={!props.personal.weChatId}
                       weChatId={props.personal.weChatId}
                       onWeChatIdDone={props.onWeChatIdDone}
        />
        <PersonalForm showForm={props.showPersonalForm}
                      onDone={props.onPersonalUpdate}
                      onClose={props.closePersonalEdit}
                      personal={props.personal}
                      personalOptions={props.personal.options}
                      showWeChatInput={!props.personal.weChatId}
                      weChatId={props.personal.weChatId}
                      onWeChatIdDone={props.onWeChatIdDone}
        />
    </div>
);

FormGroup.propTypes = {
    // states
    classmates: PropTypes.object.isRequired, // from redux store
    roommates: PropTypes.object.isRequired, // from redux store
    friends: PropTypes.object.isRequired, // from redux store
    personal: PropTypes.object.isRequired, // from redux store
    // form open/close control
    showRoommatesForm: PropTypes.bool.isRequired,
    showFriendsForm: PropTypes.bool.isRequired,
    showClassmatesForm: PropTypes.bool.isRequired,
    showPersonalForm: PropTypes.bool.isRequired,
    // actions
    // close forms
    closeClassmatesEdit: PropTypes.func.isRequired,
    closeRoommatesEdit: PropTypes.func.isRequired,
    closeFriendsEdit: PropTypes.func.isRequired,
    closePersonalEdit: PropTypes.func.isRequired,
    // update forms
    onClassmatesUpdate: PropTypes.func.isRequired,
    onRoommatesUpdate: PropTypes.func.isRequired,
    onFriendsUpdate: PropTypes.func.isRequired,
    onPersonalUpdate: PropTypes.func.isRequired,
    // global state updates
    onWeChatIdDone: PropTypes.func.isRequired,
};

const mapStateToProps = (state, ownProps) => ({
    classmates: state.profile.classmates,
    roommates: state.profile.roommates,
    friends: state.profile.friends,
    personal: state.profile.personal,
    showRoommatesForm: state.profileUI.showRoommatesForm,
    showFriendsForm: state.profileUI.showFriendsForm,
    showClassmatesForm: state.profileUI.showClassmatesForm,
    showPersonalForm: state.profileUI.showPersonalForm
});

const mapDispatchToProps = (dispatch) => (
    bindActionCreators(
        {
            closeClassmatesEdit: hideClassmatesForm,
            closeRoommatesEdit: hideRoommatesForm,
            closeFriendsEdit: hideFriendsForm,
            closePersonalEdit: hidePersonalForm,
            onClassmatesUpdate: updateClassmatesValuesRequest,
            onRoommatesUpdate: updateRoommatesValuesRequest,
            onFriendsUpdate: updateFriendsValuesRequest,
            onPersonalUpdate: updatePersonalValuesRequest,
            onWeChatIdDone: updateWeChatIdRequest
        }, dispatch
    )
);

export default connect(mapStateToProps, mapDispatchToProps)(FormGroup);;
