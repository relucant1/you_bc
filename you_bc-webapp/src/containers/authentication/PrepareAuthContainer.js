'use strict';

import React from 'react';
import './PrepareAuthContainer.less';
import { connect }  from 'react-redux';
import {bindActionCreators} from "redux";
import AuthStatus from "../../utils/AuthStatus";
import {fetchAuthStatus} from "../../actions/global/authenticationActions";
import {LOGIN} from "../../constants/api";
import { Redirect } from 'react-router-dom';
import CircularProgress from 'material-ui/CircularProgress';
import AuthTemplate from "../../components/authentication/AuthTemplate";



class PrepareAuthContainer extends React.Component{
    render() {
        if (this.props.authStatus === AuthStatus.UNKNOWN || this.props.authStatus === AuthStatus.FETCHING) {
            if (this.props.authStatus === AuthStatus.UNKNOWN) {
                this.props.fetchAuthStatus();
            }
            return (
                <AuthTemplate header={'Welcome Back'}>
                    <div className={'prepare-auth'}>
                        <p className={'prepare-auth-title'}>Securely logging you in...</p>
                        <CircularProgress size={100} thickness={7}/>
                    </div>
                </AuthTemplate>
            );
        } else if(this.props.authStatus === AuthStatus.UNAUTHORIZED) {
            return (
                <Redirect
                    to={LOGIN}
                />
            );
        } else if(this.props.authStatus === AuthStatus.AUTH_SUCCESS) {
            const { from } = this.props.location.state || { from: { pathname: "/" } };
            return (
                <Redirect
                    to={from}
                />
            );
        } else {
            return (
                <div>
                    Something went wrong
                </div>
            );
        }
    }
}

const mapStateToProps = state => ({
    authStatus: state.authentication.authStatusCode
});

const mapDispatchToProps = (dispatch) => {
    return bindActionCreators({
        fetchAuthStatus
    }, dispatch);
};

export default connect(mapStateToProps, mapDispatchToProps)(PrepareAuthContainer);