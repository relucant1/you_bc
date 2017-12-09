'use strict';

// libs
import React, {Component} from 'react'
import IconButton from 'material-ui/IconButton';
// components
import NavHeader from "../common/NavHeader";
import Icon from "../common/Icon";
import Tag from "../common/Tag";
// svg
import DemoAndroidIcon from '../../../public/svg/DemoAndroidIcon.svg';
// constants
import {PRIMARY_BLUE, PRIMARY_GREEN, SECONDARY_GREEN} from "../../styles/constants/colors";
import InfoBar from "../common/InfoBar";

class Demo extends Component {
    render() {
        return (
            <div>
                <div>this string should be covered by header</div>
                <NavHeader
                    title={"曾今的人"}
                    color={PRIMARY_BLUE}
                    // NOTE:
                    // A demo on how to use actionRight
                    // we should keep our svg files in public/svg folder
                    actionRight={<IconButton><Icon src={DemoAndroidIcon}/></IconButton>}
                />
                <br/>
                <br/>
                <br/>
                <hr/>
                <div style={{margin:28}}>
                    <Tag text={"计算机"} bkgColor={SECONDARY_GREEN} textColor={PRIMARY_GREEN}/>
                </div>
                <InfoBar msg={"展示如果很多字会不会换行展示如果很多字会不会换行展示如果很多字"} show={true}/>
                <InfoBar msg={"这个看不到这个看不到这个看不到这个看不到这个看不到"} show={false}/>
            </div>
        );
    }
}

export default Demo;