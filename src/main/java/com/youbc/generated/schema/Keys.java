/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema;


import com.youbc.generated.schema.tables.ClassmatesCourses;
import com.youbc.generated.schema.tables.ClassmatesDislikes;
import com.youbc.generated.schema.tables.ClassmatesLikes;
import com.youbc.generated.schema.tables.ClassmatesMajor;
import com.youbc.generated.schema.tables.ClassmatesProfile;
import com.youbc.generated.schema.tables.ClassmatesProfileCourses;
import com.youbc.generated.schema.tables.ClassmatesProfileTags;
import com.youbc.generated.schema.tables.ClassmatesTags;
import com.youbc.generated.schema.tables.Faculties;
import com.youbc.generated.schema.tables.FriendsDislikes;
import com.youbc.generated.schema.tables.FriendsLikes;
import com.youbc.generated.schema.tables.FriendsProfile;
import com.youbc.generated.schema.tables.FriendsProfileTags;
import com.youbc.generated.schema.tables.FriendsTags;
import com.youbc.generated.schema.tables.PendingNotification;
import com.youbc.generated.schema.tables.ProfileImage;
import com.youbc.generated.schema.tables.RelationshipStatus;
import com.youbc.generated.schema.tables.RoommatesDislikes;
import com.youbc.generated.schema.tables.RoommatesHometown;
import com.youbc.generated.schema.tables.RoommatesLikes;
import com.youbc.generated.schema.tables.RoommatesLocations;
import com.youbc.generated.schema.tables.RoommatesProfile;
import com.youbc.generated.schema.tables.RoommatesProfileTags;
import com.youbc.generated.schema.tables.RoommatesTags;
import com.youbc.generated.schema.tables.StudentVerification;
import com.youbc.generated.schema.tables.User;
import com.youbc.generated.schema.tables.UserProfile;
import com.youbc.generated.schema.tables.records.ClassmatesCoursesRecord;
import com.youbc.generated.schema.tables.records.ClassmatesDislikesRecord;
import com.youbc.generated.schema.tables.records.ClassmatesLikesRecord;
import com.youbc.generated.schema.tables.records.ClassmatesMajorRecord;
import com.youbc.generated.schema.tables.records.ClassmatesProfileCoursesRecord;
import com.youbc.generated.schema.tables.records.ClassmatesProfileRecord;
import com.youbc.generated.schema.tables.records.ClassmatesProfileTagsRecord;
import com.youbc.generated.schema.tables.records.ClassmatesTagsRecord;
import com.youbc.generated.schema.tables.records.FacultiesRecord;
import com.youbc.generated.schema.tables.records.FriendsDislikesRecord;
import com.youbc.generated.schema.tables.records.FriendsLikesRecord;
import com.youbc.generated.schema.tables.records.FriendsProfileRecord;
import com.youbc.generated.schema.tables.records.FriendsProfileTagsRecord;
import com.youbc.generated.schema.tables.records.FriendsTagsRecord;
import com.youbc.generated.schema.tables.records.PendingNotificationRecord;
import com.youbc.generated.schema.tables.records.ProfileImageRecord;
import com.youbc.generated.schema.tables.records.RelationshipStatusRecord;
import com.youbc.generated.schema.tables.records.RoommatesDislikesRecord;
import com.youbc.generated.schema.tables.records.RoommatesHometownRecord;
import com.youbc.generated.schema.tables.records.RoommatesLikesRecord;
import com.youbc.generated.schema.tables.records.RoommatesLocationsRecord;
import com.youbc.generated.schema.tables.records.RoommatesProfileRecord;
import com.youbc.generated.schema.tables.records.RoommatesProfileTagsRecord;
import com.youbc.generated.schema.tables.records.RoommatesTagsRecord;
import com.youbc.generated.schema.tables.records.StudentVerificationRecord;
import com.youbc.generated.schema.tables.records.UserProfileRecord;
import com.youbc.generated.schema.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>poke_you_bc</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ClassmatesCoursesRecord, Integer> IDENTITY_CLASSMATES_COURSES = Identities0.IDENTITY_CLASSMATES_COURSES;
    public static final Identity<ClassmatesMajorRecord, Integer> IDENTITY_CLASSMATES_MAJOR = Identities0.IDENTITY_CLASSMATES_MAJOR;
    public static final Identity<ClassmatesTagsRecord, Integer> IDENTITY_CLASSMATES_TAGS = Identities0.IDENTITY_CLASSMATES_TAGS;
    public static final Identity<FacultiesRecord, Integer> IDENTITY_FACULTIES = Identities0.IDENTITY_FACULTIES;
    public static final Identity<FriendsTagsRecord, Integer> IDENTITY_FRIENDS_TAGS = Identities0.IDENTITY_FRIENDS_TAGS;
    public static final Identity<PendingNotificationRecord, Integer> IDENTITY_PENDING_NOTIFICATION = Identities0.IDENTITY_PENDING_NOTIFICATION;
    public static final Identity<ProfileImageRecord, Integer> IDENTITY_PROFILE_IMAGE = Identities0.IDENTITY_PROFILE_IMAGE;
    public static final Identity<RelationshipStatusRecord, Integer> IDENTITY_RELATIONSHIP_STATUS = Identities0.IDENTITY_RELATIONSHIP_STATUS;
    public static final Identity<RoommatesHometownRecord, Integer> IDENTITY_ROOMMATES_HOMETOWN = Identities0.IDENTITY_ROOMMATES_HOMETOWN;
    public static final Identity<RoommatesLocationsRecord, Integer> IDENTITY_ROOMMATES_LOCATIONS = Identities0.IDENTITY_ROOMMATES_LOCATIONS;
    public static final Identity<RoommatesTagsRecord, Integer> IDENTITY_ROOMMATES_TAGS = Identities0.IDENTITY_ROOMMATES_TAGS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ClassmatesCoursesRecord> KEY_CLASSMATES_COURSES_PRIMARY = UniqueKeys0.KEY_CLASSMATES_COURSES_PRIMARY;
    public static final UniqueKey<ClassmatesCoursesRecord> KEY_CLASSMATES_COURSES_COURSE = UniqueKeys0.KEY_CLASSMATES_COURSES_COURSE;
    public static final UniqueKey<ClassmatesDislikesRecord> KEY_CLASSMATES_DISLIKES_PRIMARY = UniqueKeys0.KEY_CLASSMATES_DISLIKES_PRIMARY;
    public static final UniqueKey<ClassmatesLikesRecord> KEY_CLASSMATES_LIKES_PRIMARY = UniqueKeys0.KEY_CLASSMATES_LIKES_PRIMARY;
    public static final UniqueKey<ClassmatesMajorRecord> KEY_CLASSMATES_MAJOR_PRIMARY = UniqueKeys0.KEY_CLASSMATES_MAJOR_PRIMARY;
    public static final UniqueKey<ClassmatesMajorRecord> KEY_CLASSMATES_MAJOR_MAJOR = UniqueKeys0.KEY_CLASSMATES_MAJOR_MAJOR;
    public static final UniqueKey<ClassmatesProfileRecord> KEY_CLASSMATES_PROFILE_PRIMARY = UniqueKeys0.KEY_CLASSMATES_PROFILE_PRIMARY;
    public static final UniqueKey<ClassmatesProfileCoursesRecord> KEY_CLASSMATES_PROFILE_COURSES_PRIMARY = UniqueKeys0.KEY_CLASSMATES_PROFILE_COURSES_PRIMARY;
    public static final UniqueKey<ClassmatesProfileTagsRecord> KEY_CLASSMATES_PROFILE_TAGS_PRIMARY = UniqueKeys0.KEY_CLASSMATES_PROFILE_TAGS_PRIMARY;
    public static final UniqueKey<ClassmatesTagsRecord> KEY_CLASSMATES_TAGS_PRIMARY = UniqueKeys0.KEY_CLASSMATES_TAGS_PRIMARY;
    public static final UniqueKey<ClassmatesTagsRecord> KEY_CLASSMATES_TAGS_TAG = UniqueKeys0.KEY_CLASSMATES_TAGS_TAG;
    public static final UniqueKey<FacultiesRecord> KEY_FACULTIES_PRIMARY = UniqueKeys0.KEY_FACULTIES_PRIMARY;
    public static final UniqueKey<FacultiesRecord> KEY_FACULTIES_FACULTY = UniqueKeys0.KEY_FACULTIES_FACULTY;
    public static final UniqueKey<FriendsDislikesRecord> KEY_FRIENDS_DISLIKES_PRIMARY = UniqueKeys0.KEY_FRIENDS_DISLIKES_PRIMARY;
    public static final UniqueKey<FriendsLikesRecord> KEY_FRIENDS_LIKES_PRIMARY = UniqueKeys0.KEY_FRIENDS_LIKES_PRIMARY;
    public static final UniqueKey<FriendsProfileRecord> KEY_FRIENDS_PROFILE_PRIMARY = UniqueKeys0.KEY_FRIENDS_PROFILE_PRIMARY;
    public static final UniqueKey<FriendsProfileTagsRecord> KEY_FRIENDS_PROFILE_TAGS_PRIMARY = UniqueKeys0.KEY_FRIENDS_PROFILE_TAGS_PRIMARY;
    public static final UniqueKey<FriendsTagsRecord> KEY_FRIENDS_TAGS_PRIMARY = UniqueKeys0.KEY_FRIENDS_TAGS_PRIMARY;
    public static final UniqueKey<FriendsTagsRecord> KEY_FRIENDS_TAGS_TAG = UniqueKeys0.KEY_FRIENDS_TAGS_TAG;
    public static final UniqueKey<PendingNotificationRecord> KEY_PENDING_NOTIFICATION_PRIMARY = UniqueKeys0.KEY_PENDING_NOTIFICATION_PRIMARY;
    public static final UniqueKey<PendingNotificationRecord> KEY_PENDING_NOTIFICATION_SUBJECT = UniqueKeys0.KEY_PENDING_NOTIFICATION_SUBJECT;
    public static final UniqueKey<ProfileImageRecord> KEY_PROFILE_IMAGE_PRIMARY = UniqueKeys0.KEY_PROFILE_IMAGE_PRIMARY;
    public static final UniqueKey<RelationshipStatusRecord> KEY_RELATIONSHIP_STATUS_PRIMARY = UniqueKeys0.KEY_RELATIONSHIP_STATUS_PRIMARY;
    public static final UniqueKey<RelationshipStatusRecord> KEY_RELATIONSHIP_STATUS_RELATIONSHIP = UniqueKeys0.KEY_RELATIONSHIP_STATUS_RELATIONSHIP;
    public static final UniqueKey<RoommatesDislikesRecord> KEY_ROOMMATES_DISLIKES_PRIMARY = UniqueKeys0.KEY_ROOMMATES_DISLIKES_PRIMARY;
    public static final UniqueKey<RoommatesHometownRecord> KEY_ROOMMATES_HOMETOWN_PRIMARY = UniqueKeys0.KEY_ROOMMATES_HOMETOWN_PRIMARY;
    public static final UniqueKey<RoommatesHometownRecord> KEY_ROOMMATES_HOMETOWN_HOMETOWN = UniqueKeys0.KEY_ROOMMATES_HOMETOWN_HOMETOWN;
    public static final UniqueKey<RoommatesLikesRecord> KEY_ROOMMATES_LIKES_PRIMARY = UniqueKeys0.KEY_ROOMMATES_LIKES_PRIMARY;
    public static final UniqueKey<RoommatesLocationsRecord> KEY_ROOMMATES_LOCATIONS_PRIMARY = UniqueKeys0.KEY_ROOMMATES_LOCATIONS_PRIMARY;
    public static final UniqueKey<RoommatesLocationsRecord> KEY_ROOMMATES_LOCATIONS_LOCATION = UniqueKeys0.KEY_ROOMMATES_LOCATIONS_LOCATION;
    public static final UniqueKey<RoommatesProfileRecord> KEY_ROOMMATES_PROFILE_PRIMARY = UniqueKeys0.KEY_ROOMMATES_PROFILE_PRIMARY;
    public static final UniqueKey<RoommatesProfileTagsRecord> KEY_ROOMMATES_PROFILE_TAGS_PRIMARY = UniqueKeys0.KEY_ROOMMATES_PROFILE_TAGS_PRIMARY;
    public static final UniqueKey<RoommatesTagsRecord> KEY_ROOMMATES_TAGS_PRIMARY = UniqueKeys0.KEY_ROOMMATES_TAGS_PRIMARY;
    public static final UniqueKey<RoommatesTagsRecord> KEY_ROOMMATES_TAGS_TAG = UniqueKeys0.KEY_ROOMMATES_TAGS_TAG;
    public static final UniqueKey<StudentVerificationRecord> KEY_STUDENT_VERIFICATION_PRIMARY = UniqueKeys0.KEY_STUDENT_VERIFICATION_PRIMARY;
    public static final UniqueKey<StudentVerificationRecord> KEY_STUDENT_VERIFICATION_EMAIL = UniqueKeys0.KEY_STUDENT_VERIFICATION_EMAIL;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserProfileRecord> KEY_USER_PROFILE_PRIMARY = UniqueKeys0.KEY_USER_PROFILE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ClassmatesDislikesRecord, ClassmatesProfileRecord> CLASSMATES_DISLIKES_IBFK_1 = ForeignKeys0.CLASSMATES_DISLIKES_IBFK_1;
    public static final ForeignKey<ClassmatesDislikesRecord, ClassmatesProfileRecord> CLASSMATES_DISLIKES_IBFK_2 = ForeignKeys0.CLASSMATES_DISLIKES_IBFK_2;
    public static final ForeignKey<ClassmatesLikesRecord, ClassmatesProfileRecord> CLASSMATES_LIKES_IBFK_1 = ForeignKeys0.CLASSMATES_LIKES_IBFK_1;
    public static final ForeignKey<ClassmatesLikesRecord, ClassmatesProfileRecord> CLASSMATES_LIKES_IBFK_2 = ForeignKeys0.CLASSMATES_LIKES_IBFK_2;
    public static final ForeignKey<ClassmatesProfileRecord, UserRecord> CLASSMATES_PROFILE_IBFK_1 = ForeignKeys0.CLASSMATES_PROFILE_IBFK_1;
    public static final ForeignKey<ClassmatesProfileRecord, ClassmatesMajorRecord> CLASSMATES_PROFILE_IBFK_2 = ForeignKeys0.CLASSMATES_PROFILE_IBFK_2;
    public static final ForeignKey<ClassmatesProfileCoursesRecord, ClassmatesProfileRecord> CLASSMATES_PROFILE_COURSES_IBFK_1 = ForeignKeys0.CLASSMATES_PROFILE_COURSES_IBFK_1;
    public static final ForeignKey<ClassmatesProfileCoursesRecord, ClassmatesCoursesRecord> CLASSMATES_PROFILE_COURSES_IBFK_2 = ForeignKeys0.CLASSMATES_PROFILE_COURSES_IBFK_2;
    public static final ForeignKey<ClassmatesProfileTagsRecord, ClassmatesProfileRecord> CLASSMATES_PROFILE_TAGS_IBFK_1 = ForeignKeys0.CLASSMATES_PROFILE_TAGS_IBFK_1;
    public static final ForeignKey<ClassmatesProfileTagsRecord, ClassmatesTagsRecord> CLASSMATES_PROFILE_TAGS_IBFK_2 = ForeignKeys0.CLASSMATES_PROFILE_TAGS_IBFK_2;
    public static final ForeignKey<FriendsDislikesRecord, FriendsProfileRecord> FRIENDS_DISLIKES_IBFK_1 = ForeignKeys0.FRIENDS_DISLIKES_IBFK_1;
    public static final ForeignKey<FriendsDislikesRecord, FriendsProfileRecord> FRIENDS_DISLIKES_IBFK_2 = ForeignKeys0.FRIENDS_DISLIKES_IBFK_2;
    public static final ForeignKey<FriendsLikesRecord, FriendsProfileRecord> FRIENDS_LIKES_IBFK_1 = ForeignKeys0.FRIENDS_LIKES_IBFK_1;
    public static final ForeignKey<FriendsLikesRecord, FriendsProfileRecord> FRIENDS_LIKES_IBFK_2 = ForeignKeys0.FRIENDS_LIKES_IBFK_2;
    public static final ForeignKey<FriendsProfileRecord, UserRecord> FRIENDS_PROFILE_IBFK_1 = ForeignKeys0.FRIENDS_PROFILE_IBFK_1;
    public static final ForeignKey<FriendsProfileRecord, FacultiesRecord> FRIENDS_PROFILE_IBFK_2 = ForeignKeys0.FRIENDS_PROFILE_IBFK_2;
    public static final ForeignKey<FriendsProfileRecord, RelationshipStatusRecord> FRIENDS_PROFILE_IBFK_3 = ForeignKeys0.FRIENDS_PROFILE_IBFK_3;
    public static final ForeignKey<FriendsProfileTagsRecord, FriendsProfileRecord> FRIENDS_PROFILE_TAGS_IBFK_1 = ForeignKeys0.FRIENDS_PROFILE_TAGS_IBFK_1;
    public static final ForeignKey<FriendsProfileTagsRecord, FriendsTagsRecord> FRIENDS_PROFILE_TAGS_IBFK_2 = ForeignKeys0.FRIENDS_PROFILE_TAGS_IBFK_2;
    public static final ForeignKey<PendingNotificationRecord, UserRecord> PENDING_NOTIFICATION_IBFK_1 = ForeignKeys0.PENDING_NOTIFICATION_IBFK_1;
    public static final ForeignKey<ProfileImageRecord, UserProfileRecord> PROFILE_IMAGE_IBFK_1 = ForeignKeys0.PROFILE_IMAGE_IBFK_1;
    public static final ForeignKey<RoommatesDislikesRecord, RoommatesProfileRecord> ROOMMATES_DISLIKES_IBFK_1 = ForeignKeys0.ROOMMATES_DISLIKES_IBFK_1;
    public static final ForeignKey<RoommatesDislikesRecord, RoommatesProfileRecord> ROOMMATES_DISLIKES_IBFK_2 = ForeignKeys0.ROOMMATES_DISLIKES_IBFK_2;
    public static final ForeignKey<RoommatesLikesRecord, RoommatesProfileRecord> ROOMMATES_LIKES_IBFK_1 = ForeignKeys0.ROOMMATES_LIKES_IBFK_1;
    public static final ForeignKey<RoommatesLikesRecord, RoommatesProfileRecord> ROOMMATES_LIKES_IBFK_2 = ForeignKeys0.ROOMMATES_LIKES_IBFK_2;
    public static final ForeignKey<RoommatesProfileRecord, UserRecord> ROOMMATES_PROFILE_IBFK_1 = ForeignKeys0.ROOMMATES_PROFILE_IBFK_1;
    public static final ForeignKey<RoommatesProfileRecord, RoommatesLocationsRecord> ROOMMATES_PROFILE_IBFK_2 = ForeignKeys0.ROOMMATES_PROFILE_IBFK_2;
    public static final ForeignKey<RoommatesProfileRecord, RoommatesHometownRecord> ROOMMATES_PROFILE_IBFK_3 = ForeignKeys0.ROOMMATES_PROFILE_IBFK_3;
    public static final ForeignKey<RoommatesProfileTagsRecord, RoommatesProfileRecord> ROOMMATES_PROFILE_TAGS_IBFK_1 = ForeignKeys0.ROOMMATES_PROFILE_TAGS_IBFK_1;
    public static final ForeignKey<RoommatesProfileTagsRecord, RoommatesTagsRecord> ROOMMATES_PROFILE_TAGS_IBFK_2 = ForeignKeys0.ROOMMATES_PROFILE_TAGS_IBFK_2;
    public static final ForeignKey<StudentVerificationRecord, UserRecord> STUDENT_VERIFICATION_IBFK_1 = ForeignKeys0.STUDENT_VERIFICATION_IBFK_1;
    public static final ForeignKey<UserProfileRecord, UserRecord> USER_PROFILE_IBFK_1 = ForeignKeys0.USER_PROFILE_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ClassmatesCoursesRecord, Integer> IDENTITY_CLASSMATES_COURSES = createIdentity(ClassmatesCourses.CLASSMATES_COURSES, ClassmatesCourses.CLASSMATES_COURSES.ID);
        public static Identity<ClassmatesMajorRecord, Integer> IDENTITY_CLASSMATES_MAJOR = createIdentity(ClassmatesMajor.CLASSMATES_MAJOR, ClassmatesMajor.CLASSMATES_MAJOR.ID);
        public static Identity<ClassmatesTagsRecord, Integer> IDENTITY_CLASSMATES_TAGS = createIdentity(ClassmatesTags.CLASSMATES_TAGS, ClassmatesTags.CLASSMATES_TAGS.ID);
        public static Identity<FacultiesRecord, Integer> IDENTITY_FACULTIES = createIdentity(Faculties.FACULTIES, Faculties.FACULTIES.ID);
        public static Identity<FriendsTagsRecord, Integer> IDENTITY_FRIENDS_TAGS = createIdentity(FriendsTags.FRIENDS_TAGS, FriendsTags.FRIENDS_TAGS.ID);
        public static Identity<PendingNotificationRecord, Integer> IDENTITY_PENDING_NOTIFICATION = createIdentity(PendingNotification.PENDING_NOTIFICATION, PendingNotification.PENDING_NOTIFICATION.ID);
        public static Identity<ProfileImageRecord, Integer> IDENTITY_PROFILE_IMAGE = createIdentity(ProfileImage.PROFILE_IMAGE, ProfileImage.PROFILE_IMAGE.PROFILE_IMAGE_ID);
        public static Identity<RelationshipStatusRecord, Integer> IDENTITY_RELATIONSHIP_STATUS = createIdentity(RelationshipStatus.RELATIONSHIP_STATUS, RelationshipStatus.RELATIONSHIP_STATUS.ID);
        public static Identity<RoommatesHometownRecord, Integer> IDENTITY_ROOMMATES_HOMETOWN = createIdentity(RoommatesHometown.ROOMMATES_HOMETOWN, RoommatesHometown.ROOMMATES_HOMETOWN.ID);
        public static Identity<RoommatesLocationsRecord, Integer> IDENTITY_ROOMMATES_LOCATIONS = createIdentity(RoommatesLocations.ROOMMATES_LOCATIONS, RoommatesLocations.ROOMMATES_LOCATIONS.ID);
        public static Identity<RoommatesTagsRecord, Integer> IDENTITY_ROOMMATES_TAGS = createIdentity(RoommatesTags.ROOMMATES_TAGS, RoommatesTags.ROOMMATES_TAGS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ClassmatesCoursesRecord> KEY_CLASSMATES_COURSES_PRIMARY = createUniqueKey(ClassmatesCourses.CLASSMATES_COURSES, "KEY_classmates_courses_PRIMARY", ClassmatesCourses.CLASSMATES_COURSES.ID);
        public static final UniqueKey<ClassmatesCoursesRecord> KEY_CLASSMATES_COURSES_COURSE = createUniqueKey(ClassmatesCourses.CLASSMATES_COURSES, "KEY_classmates_courses_course", ClassmatesCourses.CLASSMATES_COURSES.COURSE);
        public static final UniqueKey<ClassmatesDislikesRecord> KEY_CLASSMATES_DISLIKES_PRIMARY = createUniqueKey(ClassmatesDislikes.CLASSMATES_DISLIKES, "KEY_classmates_dislikes_PRIMARY", ClassmatesDislikes.CLASSMATES_DISLIKES.DISLIKER, ClassmatesDislikes.CLASSMATES_DISLIKES.DISLIKEE);
        public static final UniqueKey<ClassmatesLikesRecord> KEY_CLASSMATES_LIKES_PRIMARY = createUniqueKey(ClassmatesLikes.CLASSMATES_LIKES, "KEY_classmates_likes_PRIMARY", ClassmatesLikes.CLASSMATES_LIKES.LIKER, ClassmatesLikes.CLASSMATES_LIKES.LIKEE);
        public static final UniqueKey<ClassmatesMajorRecord> KEY_CLASSMATES_MAJOR_PRIMARY = createUniqueKey(ClassmatesMajor.CLASSMATES_MAJOR, "KEY_classmates_major_PRIMARY", ClassmatesMajor.CLASSMATES_MAJOR.ID);
        public static final UniqueKey<ClassmatesMajorRecord> KEY_CLASSMATES_MAJOR_MAJOR = createUniqueKey(ClassmatesMajor.CLASSMATES_MAJOR, "KEY_classmates_major_major", ClassmatesMajor.CLASSMATES_MAJOR.MAJOR);
        public static final UniqueKey<ClassmatesProfileRecord> KEY_CLASSMATES_PROFILE_PRIMARY = createUniqueKey(ClassmatesProfile.CLASSMATES_PROFILE, "KEY_classmates_profile_PRIMARY", ClassmatesProfile.CLASSMATES_PROFILE.USER_ID);
        public static final UniqueKey<ClassmatesProfileCoursesRecord> KEY_CLASSMATES_PROFILE_COURSES_PRIMARY = createUniqueKey(ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES, "KEY_classmates_profile_courses_PRIMARY", ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES.USER_ID, ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES.COURSE);
        public static final UniqueKey<ClassmatesProfileTagsRecord> KEY_CLASSMATES_PROFILE_TAGS_PRIMARY = createUniqueKey(ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS, "KEY_classmates_profile_tags_PRIMARY", ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS.USER_ID, ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS.TAG);
        public static final UniqueKey<ClassmatesTagsRecord> KEY_CLASSMATES_TAGS_PRIMARY = createUniqueKey(ClassmatesTags.CLASSMATES_TAGS, "KEY_classmates_tags_PRIMARY", ClassmatesTags.CLASSMATES_TAGS.ID);
        public static final UniqueKey<ClassmatesTagsRecord> KEY_CLASSMATES_TAGS_TAG = createUniqueKey(ClassmatesTags.CLASSMATES_TAGS, "KEY_classmates_tags_tag", ClassmatesTags.CLASSMATES_TAGS.TAG);
        public static final UniqueKey<FacultiesRecord> KEY_FACULTIES_PRIMARY = createUniqueKey(Faculties.FACULTIES, "KEY_faculties_PRIMARY", Faculties.FACULTIES.ID);
        public static final UniqueKey<FacultiesRecord> KEY_FACULTIES_FACULTY = createUniqueKey(Faculties.FACULTIES, "KEY_faculties_faculty", Faculties.FACULTIES.FACULTY);
        public static final UniqueKey<FriendsDislikesRecord> KEY_FRIENDS_DISLIKES_PRIMARY = createUniqueKey(FriendsDislikes.FRIENDS_DISLIKES, "KEY_friends_dislikes_PRIMARY", FriendsDislikes.FRIENDS_DISLIKES.DISLIKER, FriendsDislikes.FRIENDS_DISLIKES.DISLIKEE);
        public static final UniqueKey<FriendsLikesRecord> KEY_FRIENDS_LIKES_PRIMARY = createUniqueKey(FriendsLikes.FRIENDS_LIKES, "KEY_friends_likes_PRIMARY", FriendsLikes.FRIENDS_LIKES.LIKER, FriendsLikes.FRIENDS_LIKES.LIKEE);
        public static final UniqueKey<FriendsProfileRecord> KEY_FRIENDS_PROFILE_PRIMARY = createUniqueKey(FriendsProfile.FRIENDS_PROFILE, "KEY_friends_profile_PRIMARY", FriendsProfile.FRIENDS_PROFILE.USER_ID);
        public static final UniqueKey<FriendsProfileTagsRecord> KEY_FRIENDS_PROFILE_TAGS_PRIMARY = createUniqueKey(FriendsProfileTags.FRIENDS_PROFILE_TAGS, "KEY_friends_profile_tags_PRIMARY", FriendsProfileTags.FRIENDS_PROFILE_TAGS.USER_ID, FriendsProfileTags.FRIENDS_PROFILE_TAGS.TAG);
        public static final UniqueKey<FriendsTagsRecord> KEY_FRIENDS_TAGS_PRIMARY = createUniqueKey(FriendsTags.FRIENDS_TAGS, "KEY_friends_tags_PRIMARY", FriendsTags.FRIENDS_TAGS.ID);
        public static final UniqueKey<FriendsTagsRecord> KEY_FRIENDS_TAGS_TAG = createUniqueKey(FriendsTags.FRIENDS_TAGS, "KEY_friends_tags_tag", FriendsTags.FRIENDS_TAGS.TAG);
        public static final UniqueKey<PendingNotificationRecord> KEY_PENDING_NOTIFICATION_PRIMARY = createUniqueKey(PendingNotification.PENDING_NOTIFICATION, "KEY_pending_notification_PRIMARY", PendingNotification.PENDING_NOTIFICATION.ID);
        public static final UniqueKey<PendingNotificationRecord> KEY_PENDING_NOTIFICATION_SUBJECT = createUniqueKey(PendingNotification.PENDING_NOTIFICATION, "KEY_pending_notification_subject", PendingNotification.PENDING_NOTIFICATION.SUBJECT);
        public static final UniqueKey<ProfileImageRecord> KEY_PROFILE_IMAGE_PRIMARY = createUniqueKey(ProfileImage.PROFILE_IMAGE, "KEY_profile_image_PRIMARY", ProfileImage.PROFILE_IMAGE.PROFILE_IMAGE_ID);
        public static final UniqueKey<RelationshipStatusRecord> KEY_RELATIONSHIP_STATUS_PRIMARY = createUniqueKey(RelationshipStatus.RELATIONSHIP_STATUS, "KEY_relationship_status_PRIMARY", RelationshipStatus.RELATIONSHIP_STATUS.ID);
        public static final UniqueKey<RelationshipStatusRecord> KEY_RELATIONSHIP_STATUS_RELATIONSHIP = createUniqueKey(RelationshipStatus.RELATIONSHIP_STATUS, "KEY_relationship_status_relationship", RelationshipStatus.RELATIONSHIP_STATUS.RELATIONSHIP);
        public static final UniqueKey<RoommatesDislikesRecord> KEY_ROOMMATES_DISLIKES_PRIMARY = createUniqueKey(RoommatesDislikes.ROOMMATES_DISLIKES, "KEY_roommates_dislikes_PRIMARY", RoommatesDislikes.ROOMMATES_DISLIKES.DISLIKER, RoommatesDislikes.ROOMMATES_DISLIKES.DISLIKEE);
        public static final UniqueKey<RoommatesHometownRecord> KEY_ROOMMATES_HOMETOWN_PRIMARY = createUniqueKey(RoommatesHometown.ROOMMATES_HOMETOWN, "KEY_roommates_hometown_PRIMARY", RoommatesHometown.ROOMMATES_HOMETOWN.ID);
        public static final UniqueKey<RoommatesHometownRecord> KEY_ROOMMATES_HOMETOWN_HOMETOWN = createUniqueKey(RoommatesHometown.ROOMMATES_HOMETOWN, "KEY_roommates_hometown_hometown", RoommatesHometown.ROOMMATES_HOMETOWN.HOMETOWN);
        public static final UniqueKey<RoommatesLikesRecord> KEY_ROOMMATES_LIKES_PRIMARY = createUniqueKey(RoommatesLikes.ROOMMATES_LIKES, "KEY_roommates_likes_PRIMARY", RoommatesLikes.ROOMMATES_LIKES.LIKER, RoommatesLikes.ROOMMATES_LIKES.LIKEE);
        public static final UniqueKey<RoommatesLocationsRecord> KEY_ROOMMATES_LOCATIONS_PRIMARY = createUniqueKey(RoommatesLocations.ROOMMATES_LOCATIONS, "KEY_roommates_locations_PRIMARY", RoommatesLocations.ROOMMATES_LOCATIONS.ID);
        public static final UniqueKey<RoommatesLocationsRecord> KEY_ROOMMATES_LOCATIONS_LOCATION = createUniqueKey(RoommatesLocations.ROOMMATES_LOCATIONS, "KEY_roommates_locations_location", RoommatesLocations.ROOMMATES_LOCATIONS.LOCATION);
        public static final UniqueKey<RoommatesProfileRecord> KEY_ROOMMATES_PROFILE_PRIMARY = createUniqueKey(RoommatesProfile.ROOMMATES_PROFILE, "KEY_roommates_profile_PRIMARY", RoommatesProfile.ROOMMATES_PROFILE.USER_ID);
        public static final UniqueKey<RoommatesProfileTagsRecord> KEY_ROOMMATES_PROFILE_TAGS_PRIMARY = createUniqueKey(RoommatesProfileTags.ROOMMATES_PROFILE_TAGS, "KEY_roommates_profile_tags_PRIMARY", RoommatesProfileTags.ROOMMATES_PROFILE_TAGS.USER_ID, RoommatesProfileTags.ROOMMATES_PROFILE_TAGS.TAG);
        public static final UniqueKey<RoommatesTagsRecord> KEY_ROOMMATES_TAGS_PRIMARY = createUniqueKey(RoommatesTags.ROOMMATES_TAGS, "KEY_roommates_tags_PRIMARY", RoommatesTags.ROOMMATES_TAGS.ID);
        public static final UniqueKey<RoommatesTagsRecord> KEY_ROOMMATES_TAGS_TAG = createUniqueKey(RoommatesTags.ROOMMATES_TAGS, "KEY_roommates_tags_tag", RoommatesTags.ROOMMATES_TAGS.TAG);
        public static final UniqueKey<StudentVerificationRecord> KEY_STUDENT_VERIFICATION_PRIMARY = createUniqueKey(StudentVerification.STUDENT_VERIFICATION, "KEY_student_verification_PRIMARY", StudentVerification.STUDENT_VERIFICATION.USER_ID);
        public static final UniqueKey<StudentVerificationRecord> KEY_STUDENT_VERIFICATION_EMAIL = createUniqueKey(StudentVerification.STUDENT_VERIFICATION, "KEY_student_verification_email", StudentVerification.STUDENT_VERIFICATION.EMAIL);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.USER_ID);
        public static final UniqueKey<UserProfileRecord> KEY_USER_PROFILE_PRIMARY = createUniqueKey(UserProfile.USER_PROFILE, "KEY_user_profile_PRIMARY", UserProfile.USER_PROFILE.USER_ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<ClassmatesDislikesRecord, ClassmatesProfileRecord> CLASSMATES_DISLIKES_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_PROFILE_PRIMARY, ClassmatesDislikes.CLASSMATES_DISLIKES, "classmates_dislikes_ibfk_1", ClassmatesDislikes.CLASSMATES_DISLIKES.DISLIKER);
        public static final ForeignKey<ClassmatesDislikesRecord, ClassmatesProfileRecord> CLASSMATES_DISLIKES_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_PROFILE_PRIMARY, ClassmatesDislikes.CLASSMATES_DISLIKES, "classmates_dislikes_ibfk_2", ClassmatesDislikes.CLASSMATES_DISLIKES.DISLIKEE);
        public static final ForeignKey<ClassmatesLikesRecord, ClassmatesProfileRecord> CLASSMATES_LIKES_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_PROFILE_PRIMARY, ClassmatesLikes.CLASSMATES_LIKES, "classmates_likes_ibfk_1", ClassmatesLikes.CLASSMATES_LIKES.LIKER);
        public static final ForeignKey<ClassmatesLikesRecord, ClassmatesProfileRecord> CLASSMATES_LIKES_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_PROFILE_PRIMARY, ClassmatesLikes.CLASSMATES_LIKES, "classmates_likes_ibfk_2", ClassmatesLikes.CLASSMATES_LIKES.LIKEE);
        public static final ForeignKey<ClassmatesProfileRecord, UserRecord> CLASSMATES_PROFILE_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_USER_PRIMARY, ClassmatesProfile.CLASSMATES_PROFILE, "classmates_profile_ibfk_1", ClassmatesProfile.CLASSMATES_PROFILE.USER_ID);
        public static final ForeignKey<ClassmatesProfileRecord, ClassmatesMajorRecord> CLASSMATES_PROFILE_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_MAJOR_MAJOR, ClassmatesProfile.CLASSMATES_PROFILE, "classmates_profile_ibfk_2", ClassmatesProfile.CLASSMATES_PROFILE.MAJOR);
        public static final ForeignKey<ClassmatesProfileCoursesRecord, ClassmatesProfileRecord> CLASSMATES_PROFILE_COURSES_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_PROFILE_PRIMARY, ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES, "classmates_profile_courses_ibfk_1", ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES.USER_ID);
        public static final ForeignKey<ClassmatesProfileCoursesRecord, ClassmatesCoursesRecord> CLASSMATES_PROFILE_COURSES_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_COURSES_COURSE, ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES, "classmates_profile_courses_ibfk_2", ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES.COURSE);
        public static final ForeignKey<ClassmatesProfileTagsRecord, ClassmatesProfileRecord> CLASSMATES_PROFILE_TAGS_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_PROFILE_PRIMARY, ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS, "classmates_profile_tags_ibfk_1", ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS.USER_ID);
        public static final ForeignKey<ClassmatesProfileTagsRecord, ClassmatesTagsRecord> CLASSMATES_PROFILE_TAGS_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_CLASSMATES_TAGS_TAG, ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS, "classmates_profile_tags_ibfk_2", ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS.TAG);
        public static final ForeignKey<FriendsDislikesRecord, FriendsProfileRecord> FRIENDS_DISLIKES_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_FRIENDS_PROFILE_PRIMARY, FriendsDislikes.FRIENDS_DISLIKES, "friends_dislikes_ibfk_1", FriendsDislikes.FRIENDS_DISLIKES.DISLIKER);
        public static final ForeignKey<FriendsDislikesRecord, FriendsProfileRecord> FRIENDS_DISLIKES_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_FRIENDS_PROFILE_PRIMARY, FriendsDislikes.FRIENDS_DISLIKES, "friends_dislikes_ibfk_2", FriendsDislikes.FRIENDS_DISLIKES.DISLIKEE);
        public static final ForeignKey<FriendsLikesRecord, FriendsProfileRecord> FRIENDS_LIKES_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_FRIENDS_PROFILE_PRIMARY, FriendsLikes.FRIENDS_LIKES, "friends_likes_ibfk_1", FriendsLikes.FRIENDS_LIKES.LIKER);
        public static final ForeignKey<FriendsLikesRecord, FriendsProfileRecord> FRIENDS_LIKES_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_FRIENDS_PROFILE_PRIMARY, FriendsLikes.FRIENDS_LIKES, "friends_likes_ibfk_2", FriendsLikes.FRIENDS_LIKES.LIKEE);
        public static final ForeignKey<FriendsProfileRecord, UserRecord> FRIENDS_PROFILE_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_USER_PRIMARY, FriendsProfile.FRIENDS_PROFILE, "friends_profile_ibfk_1", FriendsProfile.FRIENDS_PROFILE.USER_ID);
        public static final ForeignKey<FriendsProfileRecord, FacultiesRecord> FRIENDS_PROFILE_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_FACULTIES_FACULTY, FriendsProfile.FRIENDS_PROFILE, "friends_profile_ibfk_2", FriendsProfile.FRIENDS_PROFILE.FACULTY);
        public static final ForeignKey<FriendsProfileRecord, RelationshipStatusRecord> FRIENDS_PROFILE_IBFK_3 = createForeignKey(com.youbc.generated.schema.Keys.KEY_RELATIONSHIP_STATUS_RELATIONSHIP, FriendsProfile.FRIENDS_PROFILE, "friends_profile_ibfk_3", FriendsProfile.FRIENDS_PROFILE.RELATIONSHIP);
        public static final ForeignKey<FriendsProfileTagsRecord, FriendsProfileRecord> FRIENDS_PROFILE_TAGS_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_FRIENDS_PROFILE_PRIMARY, FriendsProfileTags.FRIENDS_PROFILE_TAGS, "friends_profile_tags_ibfk_1", FriendsProfileTags.FRIENDS_PROFILE_TAGS.USER_ID);
        public static final ForeignKey<FriendsProfileTagsRecord, FriendsTagsRecord> FRIENDS_PROFILE_TAGS_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_FRIENDS_TAGS_TAG, FriendsProfileTags.FRIENDS_PROFILE_TAGS, "friends_profile_tags_ibfk_2", FriendsProfileTags.FRIENDS_PROFILE_TAGS.TAG);
        public static final ForeignKey<PendingNotificationRecord, UserRecord> PENDING_NOTIFICATION_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_USER_PRIMARY, PendingNotification.PENDING_NOTIFICATION, "pending_notification_ibfk_1", PendingNotification.PENDING_NOTIFICATION.SUBJECT);
        public static final ForeignKey<ProfileImageRecord, UserProfileRecord> PROFILE_IMAGE_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_USER_PROFILE_PRIMARY, ProfileImage.PROFILE_IMAGE, "profile_image_ibfk_1", ProfileImage.PROFILE_IMAGE.USER_ID);
        public static final ForeignKey<RoommatesDislikesRecord, RoommatesProfileRecord> ROOMMATES_DISLIKES_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_PROFILE_PRIMARY, RoommatesDislikes.ROOMMATES_DISLIKES, "roommates_dislikes_ibfk_1", RoommatesDislikes.ROOMMATES_DISLIKES.DISLIKER);
        public static final ForeignKey<RoommatesDislikesRecord, RoommatesProfileRecord> ROOMMATES_DISLIKES_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_PROFILE_PRIMARY, RoommatesDislikes.ROOMMATES_DISLIKES, "roommates_dislikes_ibfk_2", RoommatesDislikes.ROOMMATES_DISLIKES.DISLIKEE);
        public static final ForeignKey<RoommatesLikesRecord, RoommatesProfileRecord> ROOMMATES_LIKES_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_PROFILE_PRIMARY, RoommatesLikes.ROOMMATES_LIKES, "roommates_likes_ibfk_1", RoommatesLikes.ROOMMATES_LIKES.LIKER);
        public static final ForeignKey<RoommatesLikesRecord, RoommatesProfileRecord> ROOMMATES_LIKES_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_PROFILE_PRIMARY, RoommatesLikes.ROOMMATES_LIKES, "roommates_likes_ibfk_2", RoommatesLikes.ROOMMATES_LIKES.LIKEE);
        public static final ForeignKey<RoommatesProfileRecord, UserRecord> ROOMMATES_PROFILE_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_USER_PRIMARY, RoommatesProfile.ROOMMATES_PROFILE, "roommates_profile_ibfk_1", RoommatesProfile.ROOMMATES_PROFILE.USER_ID);
        public static final ForeignKey<RoommatesProfileRecord, RoommatesLocationsRecord> ROOMMATES_PROFILE_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_LOCATIONS_LOCATION, RoommatesProfile.ROOMMATES_PROFILE, "roommates_profile_ibfk_2", RoommatesProfile.ROOMMATES_PROFILE.LOCATION);
        public static final ForeignKey<RoommatesProfileRecord, RoommatesHometownRecord> ROOMMATES_PROFILE_IBFK_3 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_HOMETOWN_HOMETOWN, RoommatesProfile.ROOMMATES_PROFILE, "roommates_profile_ibfk_3", RoommatesProfile.ROOMMATES_PROFILE.HOMETOWN);
        public static final ForeignKey<RoommatesProfileTagsRecord, RoommatesProfileRecord> ROOMMATES_PROFILE_TAGS_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_PROFILE_PRIMARY, RoommatesProfileTags.ROOMMATES_PROFILE_TAGS, "roommates_profile_tags_ibfk_1", RoommatesProfileTags.ROOMMATES_PROFILE_TAGS.USER_ID);
        public static final ForeignKey<RoommatesProfileTagsRecord, RoommatesTagsRecord> ROOMMATES_PROFILE_TAGS_IBFK_2 = createForeignKey(com.youbc.generated.schema.Keys.KEY_ROOMMATES_TAGS_TAG, RoommatesProfileTags.ROOMMATES_PROFILE_TAGS, "roommates_profile_tags_ibfk_2", RoommatesProfileTags.ROOMMATES_PROFILE_TAGS.TAG);
        public static final ForeignKey<StudentVerificationRecord, UserRecord> STUDENT_VERIFICATION_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_USER_PRIMARY, StudentVerification.STUDENT_VERIFICATION, "student_verification_ibfk_1", StudentVerification.STUDENT_VERIFICATION.USER_ID);
        public static final ForeignKey<UserProfileRecord, UserRecord> USER_PROFILE_IBFK_1 = createForeignKey(com.youbc.generated.schema.Keys.KEY_USER_PRIMARY, UserProfile.USER_PROFILE, "user_profile_ibfk_1", UserProfile.USER_PROFILE.USER_ID);
    }
}
