<template>

    <v-data-table
        :headers="headers"
        :items="fileCheck"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'FileCheckView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "name", value: "name" },
                { text: "isIndexed", value: "isIndexed" },
                { text: "isUploaded", value: "isUploaded" },
                { text: "videoUrl", value: "videoUrl" },
                { text: "size", value: "size" },
            ],
            fileCheck : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/fileChecks'))

            temp.data._embedded.fileChecks.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.fileCheck = temp.data._embedded.fileChecks;
        },
        methods: {
        }
    }
</script>

