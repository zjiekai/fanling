#!/usr/bin/env bash
TARG=$1
export BASE=$(git rev-parse --show-toplevel)
if [[ "$BASE" == "" ]]
then
    echo "need to be in the git repository"
    exit 1
fi
echo "searching for" $TARG "in" $BASE
cd $BASE
find -name *.rs | grep -v "/old/" | grep -v target | xargs grep -in --color "$1"
